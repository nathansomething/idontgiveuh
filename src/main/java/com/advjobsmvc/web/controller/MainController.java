package com.advjobsmvc.web.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.YesNoDecision;

@Controller
public class MainController {

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String printWelcome(ModelMap model) {
//		model.addAttribute("message", "This is my first Spring Application");
//		model.addAttribute("Date", LocalDate.now());
//		return "hello";
//	}
//
//	@RequestMapping(value = "/date", method = RequestMethod.GET)
//	public Model Date(Model model) {
//		model.addAttribute("Date", LocalDate.now());
//		model.addAttribute("Time", LocalTime.now());
//		return model;
//	}
	
	@RequestMapping(value = "//{code:.+}/", method = RequestMethod.GET)
	public ModelAndView home(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("homepage");
		model.addObject("code", code);

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/buy", method = RequestMethod.GET)
	public ModelAndView buy(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("buy");
		model.addObject("code", code);

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/eat", method = RequestMethod.GET)
	public ModelAndView eat(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("eat");
		model.addObject("code", code);

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/do", method = RequestMethod.GET)
	public ModelAndView do_(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("do");
		model.addObject("code", code);

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/go", method = RequestMethod.GET)
	public ModelAndView go(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("go");
		model.addObject("code", code);

		return model;
	}
}