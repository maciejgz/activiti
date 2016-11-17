package pl.mg.activity.controller;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.impl.db.DbSchemaCreate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkflowController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView model) {
		model.setViewName("index");
		return model;
	}

	@RequestMapping("/startProcess")
	public ModelAndView startProcess(ModelAndView model) {
		model.setViewName("startProcess");
		
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		

		
		return model;
	}
	
	
	@RequestMapping("/createDatabase")
	public ModelAndView createDatabase(ModelAndView model) {
		model.setViewName("startProcess");
		
		DbSchemaCreate.main(null);
		

		
		return model;
	}

}
