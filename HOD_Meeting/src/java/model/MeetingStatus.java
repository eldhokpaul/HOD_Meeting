package model;
// Generated Nov 14, 2018 3:30:41 PM by Hibernate Tools 4.3.1



/**
 * MeetingStatus generated by hbm2java
 */
public class MeetingStatus  implements java.io.Serializable {


     private Integer meetStatusId;
     private Hod hod;
     private Meeting meeting;
     private String status;

    public MeetingStatus() {
    }

    public MeetingStatus(Hod hod, Meeting meeting, String status) {
       this.hod = hod;
       this.meeting = meeting;
       this.status = status;
    }
   
    public Integer getMeetStatusId() {
        return this.meetStatusId;
    }
    
    public void setMeetStatusId(Integer meetStatusId) {
        this.meetStatusId = meetStatusId;
    }
    public Hod getHod() {
        return this.hod;
    }
    
    public void setHod(Hod hod) {
        this.hod = hod;
    }
    public Meeting getMeeting() {
        return this.meeting;
    }
    
    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


