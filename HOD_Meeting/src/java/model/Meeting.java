package model;
// Generated Nov 14, 2018 3:30:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Meeting generated by hbm2java
 */
public class Meeting  implements java.io.Serializable {


     private Integer meetingId;
     private String meetingTitle;
     private String generatedDate;
     private String meetingDate;
     private String time;
     private String venue;
     private String message;
     private String status;
     private Set meetingStatuses = new HashSet(0);
     private Set meetingReplies = new HashSet(0);

    public Meeting() {
    }

    public Meeting(String meetingTitle, String generatedDate, String meetingDate, String time, String venue, String message, String status, Set meetingStatuses, Set meetingReplies) {
       this.meetingTitle = meetingTitle;
       this.generatedDate = generatedDate;
       this.meetingDate = meetingDate;
       this.time = time;
       this.venue = venue;
       this.message = message;
       this.status = status;
       this.meetingStatuses = meetingStatuses;
       this.meetingReplies = meetingReplies;
    }
   
    public Integer getMeetingId() {
        return this.meetingId;
    }
    
    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }
    public String getMeetingTitle() {
        return this.meetingTitle;
    }
    
    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }
    public String getGeneratedDate() {
        return this.generatedDate;
    }
    
    public void setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
    }
    public String getMeetingDate() {
        return this.meetingDate;
    }
    
    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public String getVenue() {
        return this.venue;
    }
    
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getMeetingStatuses() {
        return this.meetingStatuses;
    }
    
    public void setMeetingStatuses(Set meetingStatuses) {
        this.meetingStatuses = meetingStatuses;
    }
    public Set getMeetingReplies() {
        return this.meetingReplies;
    }
    
    public void setMeetingReplies(Set meetingReplies) {
        this.meetingReplies = meetingReplies;
    }




}

