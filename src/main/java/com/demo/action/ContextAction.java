package com.demo.action;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ContextAction {

    public String demo01(){
        System.out.println("demo01");
        return Action.NONE;
    }
    
    public String demo02(){
        System.out.println("demo02");
        return "success";
    }
    
    public String demo03(){
        ActionContext context = ServletActionContext.getContext();
        Map<String, Object> parameters = context.getParameters();
        System.out.println(parameters.size());
        
        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, String[]> map = request.getParameterMap();
        System.out.println(map.size());
        
        ServletContext context2 = ServletActionContext.getServletContext();
        Enumeration<String> names = context2.getAttributeNames();
        System.out.println(names.nextElement());
        return Action.NONE;
    }
    
    public String demo04(){
        return Action.ERROR;
    }
    
}
