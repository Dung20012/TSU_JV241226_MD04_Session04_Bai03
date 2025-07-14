package com.data.session_04.controller;

import com.data.session_04.model.Product;
import com.data.session_04.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greet() {
        List<Product> productList = productService.getAll();
        ModelAndView modelAndView = new ModelAndView("listProduct");
        modelAndView.addObject("products", productList);
        return modelAndView;
    }
}
