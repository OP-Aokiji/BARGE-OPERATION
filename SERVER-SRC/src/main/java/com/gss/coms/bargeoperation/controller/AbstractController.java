package com.gss.coms.bargeoperation.controller;

import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public abstract class AbstractController {
	public enum RESULT_STATUS {
		SUCCESS, ERROR, NOTHING
	}

	@ExceptionHandler(Exception.class)
	public ModelAndView excetpionHandle() {
		return new ModelAndView("error/fatal-error");
	}

	@ExceptionHandler(ServletException.class)
	public ModelAndView servletExcetpionHandle() {
		return new ModelAndView("error/fatal-error");
	}
}
