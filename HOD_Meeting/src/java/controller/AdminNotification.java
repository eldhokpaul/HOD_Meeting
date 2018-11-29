package controller;

import com.mysql.jdbc.log.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import model.HibernateUtil;
import model.Hod;
import model.Login;
import model.Meeting;
import model.MeetingReply;
import model.MeetingStatus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminNotification {

    @RequestMapping(value = "/ad_noti")
    public String ad_noti() {
        return "ad_manage_notif";
    }

    @RequestMapping(value = "/ad_ad_noti")
    public String ad_manage_notif() {
        return "ad_notification";
    }

    @RequestMapping(value = "/ad_noti_actn", method = RequestMethod.POST)
    public String notiactn(@ModelAttribute("SpringWeb") Meeting mt, MeetingStatus ms, Hod hod, ModelMap mp) {
        Session sess = null;
        String name = null;

        sess = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessfact = new Configuration().configure().buildSessionFactory();
        
        int id = 0;
        int i = 0;
        String s1 = null;

        int s = 0;
        String q = "from Hod";
        List<Hod> list = new ArrayList<Hod>();
        list = sess.createQuery(q).list();

        for ( i = 0; i < list.size() ; i++) {  
            
            Transaction tr = sess.beginTransaction();
            int h_id = list.get(i).getHodId();
            Date date = new Date();
            DateFormat df = new SimpleDateFormat();
            String formatedData = df.format(date);
            mt.setGeneratedDate(formatedData);
            mt.setStatus("open");
            sess.save(mt);
            ms.setMeeting(mt);
            hod.setHodId(h_id);
            ms.setHod(hod);
            ms.setStatus("pending");
            sess.save(ms);
            sess.getTransaction().commit();
           

        }
        
     //   return "ad_notification";
//        mp.addAttribute("msg",i);
        
        return "ad_notification";

    }

    @RequestMapping(value = "/ad_view_reply")
    public String ad_view_reply(@ModelAttribute("springweb") MeetingReply mt, ModelMap mp) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            List result = session.createQuery("from MeetingReply").list();
            mp.addAttribute("feed", result);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }

        return "ad_view_reply";
    }

    @RequestMapping(value = "/ad_view_status")
    public String ad_view_status(@ModelAttribute("springweb") MeetingStatus mt, ModelMap mp) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            List result = session.createQuery("from MeetingStatus").list();
            mp.addAttribute("feed", result);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }

        return "ad_view_status";
    }

}
