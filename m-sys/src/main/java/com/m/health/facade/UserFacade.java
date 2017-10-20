package com.m.health.facade;

import com.m.health.entity.User;
import com.m.health.entity.base.BaseEntity;
import com.m.health.facade.common.BaseFacade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/10/20.
 */
@Component
public class UserFacade extends BaseFacade {


    /**
     * 根据登录名获取当前用户
     * @param username
     * @param s
     * @return
     */
    public User getUserByLoginName(String username, String s) {
        String hql = "from User where loginName = '"+username+"' and status<> '-1'" ;
        User user = createQuery(User.class, hql, new ArrayList<Object>()).getSingleResult();
        return user;
    }
}
