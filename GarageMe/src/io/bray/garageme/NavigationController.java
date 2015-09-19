package io.bray.garageme;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NavigationController {
	@RequestMapping("/browse")
	public ModelAndView browse(){
		ModelAndView mv = new ModelAndView("browse");
		/*
		 * Select all of the Entries before 45 days or so and add their pertinent data to the model
		 * Render them in the .jsp file
		 */
		
		return mv;
	}
}
