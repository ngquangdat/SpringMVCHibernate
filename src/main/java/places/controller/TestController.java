package places.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import places.service.TestService;



@Controller
public class TestController {
	private TestService testService;
	
	@Autowired
	public void setTestService(TestService ts){
		this.testService = ts;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String listTests(Model model) {
		model.addAttribute("listTests", this.testService.listTests());
		return "test";
	}

}
