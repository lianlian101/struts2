package com.demo.action;

import com.alibaba.fastjson.JSON;
import com.demo.entity.User;
import com.demo.util.RequestJsonUtil;

public class AjaxAction {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public String getUserForJson(){
        user = new User(1,"张三");
        return "success";
    }
    
    public String postJson(){
        /*String data = RequestJsonUtil.getJsonData();
        System.out.println(data);
        User u = JSON.parseObject(data, User.class);
        System.out.println(u);
        System.out.println("==================================");*/
        String data2 = RequestJsonUtil.getJsonData2();
        System.out.println(data2);
        User u2 = JSON.parseObject(data2, User.class);
        System.out.println(u2);
        return "success";
    }
    
}
