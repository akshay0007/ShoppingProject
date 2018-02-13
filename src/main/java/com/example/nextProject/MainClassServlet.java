package com.example.nextProject;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ubuntu on 13/2/18.
 */
@WebServlet(urlPatterns = "/login.do")
public class MainClassServlet extends HttpServlet {

    ValidateClass validateClass = new ValidateClass();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("name", "login");
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("name");
        String passwd = request.getParameter("pass");
//        request.setAttribute("pass", request.getParameter("pass"));
        if (validateClass.isValidate(uname, passwd)) {
            request.setAttribute("name", request.getParameter("name"));
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("name", "invalidate creditials");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}
