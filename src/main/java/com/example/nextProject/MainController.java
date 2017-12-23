package com.example.nextProject;

import com.example.nextProject.BackhandCode.Category;
import com.example.nextProject.BackhandCode.CategoryDAO;
import com.example.nextProject.BackhandCode.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ubuntu on 16/12/17.
 */

@Controller
//@ComponentScan(value = "com.example")
public class MainController {

    @Autowired
    HttpSession httpSession;

    @RequestMapping(value = {"/", "/home"})
    public ModelAndView showHello() {
        ModelAndView mv = new ModelAndView("app");
        mv.addObject("title", "home");
        mv.addObject("userclickHome", "true");
        return mv;
    }

    @RequestMapping(value = {"/service"})
    public ModelAndView servicecall() {
        ModelAndView mv = new ModelAndView("app");
        mv.addObject("title", "service");
        mv.addObject("userclickService", "true");

        Product product = new Product();
        product.setSupplierId(4);
        product.setActive(true);

        mv.addObject("mproduct", product);
        return mv;
    }

    @RequestMapping(value = {"/about"})
    public ModelAndView about() {
        ModelAndView mv = new ModelAndView("app");
        mv.addObject("title", "about");
        mv.addObject("userclickAbout", "true");
        return mv;
    }

    @RequestMapping(value = {"/contact"})
    public ModelAndView contact() {
        ModelAndView mv = new ModelAndView("app");
        mv.addObject("userclickContact", "true");
        mv.addObject("title", "contact");
        return mv;
    }

    @RequestMapping(value = {"/csrfLogin"})
    public ModelAndView csrfLogin(@RequestParam(name = "error", required = false) String error
            , @RequestParam(name = "logout", required = false) String logout) {
        ModelAndView mv = new ModelAndView("csrflogin");
        if (logout != null)
            mv.addObject("message", "lgout succ");
        if (error != null)
            mv.addObject("message", "invalid credentials");
        mv.addObject("userclickCsrfLogin", "true");
        mv.addObject("title", "csrflogin");
        return mv;
    }


    @RequestMapping(value = {"/acceess-denied"})
    public ModelAndView accessDenied() {
        ModelAndView mv = new ModelAndView("app");
        mv.addObject("userclickaccessdenied", "true");
        mv.addObject("title", "accessdenied");
        return mv;
    }


    @RequestMapping(value = {"/logout-perform"})
    public String logoutPerform(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";

    }

    public void getHttpSession() {
        if (httpSession.getAttribute("hello") == null) {
            Authentication authentication = SecurityContextHolder.getContext().
                    getAuthentication();
        }
    }


//    @Autowired
//    CategoryDAO categoryDAO;
//
//    @ModelAttribute("categories")
//    public List<Category> getCategories() {
//        return categoryDAO.list();
//    }
}