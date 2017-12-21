package com.example.nextProject;

import com.example.nextProject.BackhandCode.Category;
import com.example.nextProject.BackhandCode.CategoryDAO;
import com.example.nextProject.BackhandCode.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by ubuntu on 16/12/17.
 */

@Controller
//@ComponentScan(value = "com.example")
public class MainController {

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


//    @Autowired
//    CategoryDAO categoryDAO;
//
//    @ModelAttribute("categories")
//    public List<Category> getCategories() {
//        return categoryDAO.list();
//    }
}