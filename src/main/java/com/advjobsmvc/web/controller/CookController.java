package com.advjobsmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.RecipeData;

@Controller
public class CookController {

	@RequestMapping(value = "//{code:.+}/cook", method = RequestMethod.GET)
	public ModelAndView cook(@PathVariable("code") String code) {

		ModelAndView model = new ModelAndView();
		model.setViewName("cook");
		model.addObject("code", code);
		model.addObject("recipeData", new RecipeData());

		return model;
	}
	
	@RequestMapping(value = "//{code:.+}/cook/resp", method = RequestMethod.POST)
	public ModelAndView cook_resp(@PathVariable("code") String code, RecipeData recipeData) {
		
		if (!recipeData.getSure()) {
			recipeData.setAnswerUrl(recipeData.getRecipeUrl());
		}
		
		ModelAndView model = new ModelAndView();
		model.setViewName("cookresponse");
		model.addObject("code", code);
		model.addObject("recipeData", recipeData);

		return model;
	}
}