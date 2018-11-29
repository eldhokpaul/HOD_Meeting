package model;
// Generated Nov 14, 2018 3:30:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Hod generated by hbm2java
 */
public class Hod  implements java.io.Serializable {


     private Integer hodId;
     private Login login;
     private String fname;
     private String lname;
     private String phone;
     private String email;
     private Set staffs = new HashSet(0);
     private Set meetingReplies = new HashSet(0);
     private Set departments = new HashSet(0);
     private Set meetingStatuses = new HashSet(0);

    public Hod() {
    }

    public Hod(Login login, String fname, String lname, String phone, String email, Set staffs, Set meetingReplies, Set departments, Set meetingStatuses) {
       this.login = login;
       this.fname = fname;
       this.lname = lname;
       this.phone = phone;
       this.email = email;
       this.staffs = staffs;
       this.meetingReplies = meetingReplies;
       this.departments = departments;
       this.meetingStatuses = meetingStatuses;
    }
   
    public Integer getHodId() {
        return this.hodId;
    }
    
    public void setHodId(Integer hodId) {
        this.hodId = hodId;
    }
    public Login getLogin() {
        return this.login;
    }
    
    public void setLogin(Login login) {
        this.login = login;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getStaffs() {
        return this.staffs;
    }
    
    public void setStaffs(Set staffs) {
        this.staffs = staffs;
    }
    public Set getMeetingReplies() {
        return this.meetingReplies;
    }
    
    public void setMeetingReplies(Set meetingReplies) {
        this.meetingReplies = meetingReplies;
    }
    public Set getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set departments) {
        this.departments = departments;
    }
    public Set getMeetingStatuses() {
        return this.meetingStatuses;
    }
    
    public void setMeetingStatuses(Set meetingStatuses) {
        this.meetingStatuses = meetingStatuses;
    }




}


