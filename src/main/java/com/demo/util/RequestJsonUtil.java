package com.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class RequestJsonUtil {

    public static String getJsonData() {
        // 获取Request对象
        HttpServletRequest request = ServletActionContext.getRequest();
        StringBuffer sb = new StringBuffer();
        try {
            // json格式字符串
            String jsonStr = "";
            // 获取application/json格式数据，返回字符流
            BufferedReader reader = request.getReader();
            // 对字符流进行解析
            while ((jsonStr = reader.readLine()) != null) {
                sb.append(jsonStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String getJsonData2() {
        ActionContext ctx = ActionContext.getContext();
        HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
        String result = "";
        try {
            InputStream in = request.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
            String msg = "";
            while ((msg = reader.readLine()) != null) {
                result += msg;
            }
            reader.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
