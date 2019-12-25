package com.demo.action;

public class CompanyAction {

    private Integer companyId;
    
    private String companyName;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getCompany(){
        System.out.println("companyId: " + companyId + ", companyName: " + companyName);
        if(1 == companyId){
            return "success";
        }
        return "company";
    }
    
    public String companyShow(){
        return "success";
    }
    
    
}
