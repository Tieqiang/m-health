package com.m.health.service;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

/**
 * Created by Administrator on 2017/10/20.
 */
@Controller
@Path("test")
@Produces("application/json")
public class TestService {

    @GET
    public Date getDate(){
        return new Date();
    }

}
