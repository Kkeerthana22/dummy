package com.capg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capg.spring.dto.ScheduledSessions;
import com.capg.spring.service.SessionService;



@Controller
public class Sessioncontroller {
	@Autowired
	SessionService sessionService;
	
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	   public ModelAndView showAllSessions(@ModelAttribute("session") ScheduledSessions session){
	   List<ScheduledSessions> sessionList=sessionService.showAllSessions();		
		return new ModelAndView("show","sessiondata",sessionList);
		
		
	
}
}
