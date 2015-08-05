package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.service.BaseService;

@Controller
public class BaseController {

	@Autowired
	BaseService baseService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("BaseController:home() starting.");

		baseService.home();
		ModelAndView model = new ModelAndView("home");
		model.addObject("msg", "hello world!");

		System.out.println("BaseController:home() ending.");
		return model;
	}

}
