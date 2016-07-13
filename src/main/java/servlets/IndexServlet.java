package servlets;

import Dao.UserDao;
import entities.User;
import org.hibernate.Session;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by kiumars-pc on 6/28/2016.
 */
@WebServlet(urlPatterns ="/index")
public class IndexServlet extends HttpServlet {
    @EJB
    UserDao r;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = new User();
        user.setLogin("fsk");
        user.setPassword("asfskafs");
        r.save(user);

        ArrayList<String> a=new ArrayList<String>();
       a.add("misha");
        a.add("alexy");
        a.add("ura");

        ArrayList<String> b=new ArrayList<String>();
        b.add("ku");
        b.add("se");
        b.add("gf");
        req.setAttribute("r",a);
        req.setAttribute("q",b);

        req.setAttribute("myName","fz");
        req.setAttribute("list",r.findAll());

        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
