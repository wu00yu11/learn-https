package com.learn.demo.https.controller;

import cn.hutool.crypto.digest.HMac;
import cn.hutool.crypto.digest.HmacAlgorithm;
import com.learn.demo.https.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/login")
@Slf4j
public class LoginController {

    @PostMapping(value = "/v1/doLogin")
    public String doLogin(HttpServletResponse response, @RequestBody UserInfo userInfo){
        String testStr = userInfo.toString();
        byte[] key = "123456".getBytes();
        HMac mac = new HMac(HmacAlgorithm.HmacMD5, key);
        String macHex1 = mac.digestHex(testStr);
        response.addHeader("authToken",macHex1);
        return macHex1;
    }

    @GetMapping(value = "/v1/validate")
    public String validate(HttpServletRequest request){
        String authorization = request.getHeader("Authorization");
        log.info("Authorization: {}",authorization);
        return authorization;
    }
}
