package com.advjobsmvc.web.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.YesNoDecision;

@Controller
public class DecisionController {

	@RequestMapping(value = "//{code:.+}/decide", method = RequestMethod.GET)
	public ModelAndView decide(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("decide");
		model.addObject("code", code);

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/decide/yesno", method = RequestMethod.GET)
	public ModelAndView decide_yesno(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("yesno");
		model.addObject("code", code);
		model.addObject("decision", new YesNoDecision());

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/decide/yesno/resp", method = RequestMethod.POST)
	public ModelAndView decide_yesno_resp(@PathVariable("code") String code, YesNoDecision decision) {
		decision.removeQuestion();
		decision.setAnswer(new Random().nextBoolean());
		decision.setSure(false);
		ModelAndView model = new ModelAndView();
		model.setViewName("response");
		model.addObject("code", code);
		model.addObject("decision", decision);


		return model;
	}
	

}
