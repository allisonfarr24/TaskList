package com.taskList.TaskList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.taskList.TaskList.dao.TaskDao;
import com.taskList.TaskList.entity.Task;



@Controller
public class HomeController {
	
	@Autowired
	TaskDao t;
	
	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("welcome", "test", "Hello");
	}

	@RequestMapping("/tasklist")
	public ModelAndView taskList() {
		
		return new ModelAndView("tasklist", "task", t.findAll());
	}

	
	@RequestMapping("/taskform")
	public ModelAndView taskform() {

		return new ModelAndView("taskform", "test1", "This is a test");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("idemail") String idemail,@RequestParam("description") String description, @RequestParam("duedate") String duedate, @RequestParam(name="complete", required=false) Boolean complete) {
		if (complete == null) {
			complete=false;
		}
		
		Task t1 = new Task(idemail, description, duedate, complete);
		t.update(t1);
		return new ModelAndView("tasklist", "task1", t.findAll());
	}
}
