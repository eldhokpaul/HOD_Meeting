package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import model.Department;
import model.HibernateUtil;
import model.Hod;
import model.Login;
import model.Meeting;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/ad_manage_hod")
    public String area() {
        return "ad_manage_hod";
    }

    @RequestMapping(value = "/log", method = RequestMethod.POST)
    public String log(@ModelAttribute("SpringWeb") Login log, ModelMap mp, Model model) {
        Session session = null;
        String un = log.getUsername();
        String pass = log.getPassword();

        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String q = "from Login where username='" + un + "' and password='" + pass + "'";

        List list = session.createQuery(q).list();
        Iterator it = list.iterator();
        String type = null;

        if (it.hasNext()) {
            Object o = it.next();
            log = (Login) o;
            type = log.getType();

            if (type.equalsIgnoreCase("admin")) {
                type = "admin_home";
            }
        } else {
            model.addAttribute("msg", "invalid username or password!");
            model.addAttribute("link", "login");
            type = "a";
        }
        session.getTransaction().commit();
        return type;

    }

    @RequestMapping(value = "/ad_manage_hod_actn")
    public String clnt_reg(@ModelAttribute("SpringWeb") Login log, Hod reg,Department dt, ModelMap mp,Model model) {
        Session sess = null;
         String type = null;
String dptname = dt.getDeptName();
        try {
            sess = HibernateUtil.getSessionFactory().openSession();
            SessionFactory sessfact = new Configuration().configure().buildSessionFactory();
            sess = sessfact.openSession();
            Transaction tr = sess.beginTransaction();
String q = "From Department where deptName = '"+dptname+"'";
        List list = sess.createQuery(q).list();
        Iterator it = list.iterator();
       
        if (it.hasNext()) {
            model.addAttribute("msg", "Department already created");
            model.addAttribute("link", "ad_manage_hod");
            type = "a";
        } else {
            log.setType("hod");

            reg.setLogin(log);
            sess.save(log);
            sess.save(reg);
            dt.setHod(reg);
            
              sess.save(dt);

           
            tr.commit();}
model.addAttribute("msg", dt.getHod().toString());
            model.addAttribute("link", "ad_manage_hod");
            type = "a";
        } catch (Exception e) {
            System.out.println(e);
        }
        return type;
    }

//    @RequestMapping(value = "/ad_manage_dept")
//    public String ad_manage_dept(@ModelAttribute("SpringWeb") Hod reg, ModelMap mp) {
//
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            session.beginTransaction();
//
//            List result = session.createQuery("from Hod").list();
//
//            mp.addAttribute("users", result);
////     List result1 = session.createQuery("from Department ").list();
////     mp.addAttribute("feed", result1);
//            session.getTransaction().commit();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return "ad_manage_dept";
//    }
//
//    @RequestMapping(value = "/ad_dept_actn", method = RequestMethod.POST)
//    public String dept_reg(@ModelAttribute("SpringWeb") Department dt, Hod hod, ModelMap mp, Model model) {
//        Session sess = null;
//        
//      //  dt.setHod(dt.getHod());
//
//        sess = HibernateUtil.getSessionFactory().openSession();
//        SessionFactory sessfact = new Configuration().configure().buildSessionFactory();
//        sess = sessfact.openSession();
//
//        Transaction tr = sess.beginTransaction();
//        String dptname = dt.getDeptName();
//        String q = "From Department where hod = '"+dt.getHod()+"'";
//        List list = sess.createQuery(q).list();
//        Iterator it = list.iterator();
//        String type = null;
//        if (it.hasNext()) {
//            model.addAttribute("msg", "Department already created");
//            model.addAttribute("link", "ad_manage_dept");
//            type = "a";
//        } else {
//
//            sess.save(dt);
//
//            tr.commit();
//            model.addAttribute("msg", dt.getHod().toString());
//            model.addAttribute("link", "ad_manage_dept");
//            type = "a";
//        }
//        return type;
//    }

    @RequestMapping(value = "/ad_view_dept")
    public String ad_view_dept(@ModelAttribute("SpringWeb") Department dept, ModelMap mp) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            List result2 = session.createQuery("from Department").list();
            mp.addAttribute("feed", result2);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "ad_view_dept";
    }

}
