/**
 * 
 */
package rw.ac.rca.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import rw.ac.rca.service.CalculatorService;

/**
 * @author Aphrodice Rwagaju
 *
 */
@Controller
public class AddController {
	
	//Second method to pass values
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2") int b, HttpServletRequest request, HttpServletResponse response) {
//	First method to pass values
//	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//		int a = Integer.parseInt(request.getParameter("t1"));
//		int b = Integer.parseInt(request.getParameter("t2"));
		CalculatorService calcService = new CalculatorService();
		double sum = calcService.addTwoNumbers(a, b);
		double prod = calcService.multiplyTwoNumbers(a, b);
		ModelAndView mv = new ModelAndView();
		//When suffix and prefix are set, no need of .jsp suffix on the page
		mv.setViewName("results");
		mv.addObject("theSum", sum);
		mv.addObject("product", prod);
		return mv;
	}
}
 