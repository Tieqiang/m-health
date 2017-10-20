package com.m.health;

import com.m.health.security.PasswordAndSalt;
import com.m.health.security.SystemPasswordService;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.junit.Test;

/**
 * Created by Administrator on 2017/10/20.
 */
public class PasswordTest {

    @Test
    public void tetPassword(){
//        PasswordAndSalt passwordAndSalt = new PasswordAndSalt("admin","");
        PasswordAndSalt passwordAndSalt = SystemPasswordService.enscriptPassword("admin", "admin");
        System.out.println(passwordAndSalt);
    }

    @Test
    public void  test(){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("admin","amdin","");
        com.m.health.security.UsernamePasswordToken usernamePasswordToken1  = (com.m.health.security.UsernamePasswordToken) usernamePasswordToken;
    }
}
