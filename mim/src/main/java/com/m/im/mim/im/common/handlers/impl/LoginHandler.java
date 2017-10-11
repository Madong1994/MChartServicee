package com.m.im.mim.im.common.handlers.impl;


import com.alibaba.fastjson.JSONObject;
import com.m.im.common.entity.MUser;
import com.m.im.mim.im.common.IMPacket;
import com.m.im.mim.im.common.entity.User;
import com.m.im.mim.im.common.handlers.BaseHandler;
import com.m.im.mim.im.common.protof.RequestModel;
import com.m.im.mim.im.common.protof.ResponseModel;
import com.m.im.mim.im.common.util.HandlerCode;
import com.m.im.mim.im.common.util.RequestCode;
import com.m.im.mim.im.common.util.ResponseCode;
import com.m.im.mim.im.common.util.annotation.IMInterceptor;
import com.m.im.mim.im.common.util.annotation.IMRequest;
import com.m.im.mim.im.common.util.tool.*;
import com.m.im.service.UserQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.Aio;
import org.tio.core.ChannelContext;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


@IMRequest(requestCode = RequestCode.LOGIN)
@IMInterceptor
public class LoginHandler implements BaseHandler {

    private static Logger log = LoggerFactory.getLogger(LoginHandler.class);
    @Override
    public String init(RequestModel.ImRequest imRequest, ChannelContext<Object, IMPacket, Object> channelContext) {
        String userJson = imRequest.getData();
        User user = User.toUser(userJson);
        String pwd = "";
        try {
            pwd= MD5Util.EncoderByMD5(user.getPwd());
        } catch (NoSuchAlgorithmException e) {
            log.info(e.getMessage());
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            log.info(e.getMessage());
            e.printStackTrace();
        }
        MUser muser = UserQuery.me().findUserByNumPwd(user.getUserNum(),pwd);
        if(muser == null){
            //没有注册
            ResultMsg resultMsg = new ResultMsg();
            resultMsg.setResultCode(ResultMsgCode.LOGIN_FAIL);
            resultMsg.setResultMsg("登录失败");
            ResponseModel.ImResponse imResponse = ProtoBufUtil.responseModelFactory(ResponseCode.RES_LOGIN, HandlerCode.RESPONSE,"0","0", System.currentTimeMillis()+"", JSONObject.toJSONString(resultMsg));
            IMSend.send(channelContext,imResponse);
            return null;
        }
        //绑定tio
        Aio.bindUser(channelContext,user.getUserNum());
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setResultCode(ResultMsgCode.LOGIN_SCUSSE);
        resultMsg.setResultMsg("登录成功");
        ResponseModel.ImResponse imResponse = ProtoBufUtil.responseModelFactory(ResponseCode.RES_LOGIN,HandlerCode.RESPONSE,"0","0", System.currentTimeMillis()+"", JSONObject.toJSONString(resultMsg));
        IMSend.send(channelContext,imResponse);
        return null;
    }
}
