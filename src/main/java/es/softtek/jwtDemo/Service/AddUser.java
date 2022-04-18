package es.softtek.jwtDemo.Service;

public class AddUser {
            String emailid;
            String site;
            String account;
            Boolean isVIPUser;
            Float CostPerHour;
            String lastName;
            String firstName;
            String loginName;
            String userpassword;
            String[] role;

    public AddUser(String emailid, String site, String account, Boolean isVIPUser, Float costPerHour, String lastName, String firstName, String loginName, String userpassword, String[] role) {
    this.account=account;
    this.CostPerHour=costPerHour;
    this.emailid=emailid;
    this.firstName=firstName;
    this.lastName=lastName;
    this.isVIPUser=isVIPUser;
    this.loginName=loginName;
    this.role=role;
    this.site=site;
    this.userpassword=userpassword;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Boolean getVIPUser() {
        return isVIPUser;
    }

    public void setVIPUser(Boolean VIPUser) {
        isVIPUser = VIPUser;
    }

    public Float getCostPerHour() {
        return CostPerHour;
    }

    public void setCostPerHour(Float costPerHour) {
        CostPerHour = costPerHour;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }
}
