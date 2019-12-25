package com.demo.action;

public class UserAction {

    private String username;
    
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 登录界面跳转
     * @return
     */
    public String login(){
        return "login";
    }
    
    /**
     * 登录验证
     * @return
     */
    public String loginGo(){
        System.out.println("username: " + username + ", password:" + password);
        if("张三".equals(username) && "123".equals(password)){
            return "welcome";
        }
        return "login";
    }
    
    
}
