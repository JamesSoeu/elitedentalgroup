package com.elitedentalgroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({ "/", "/home" })
	public String getHomePage(ModelMap model) {

		return "homePage";
	}

	@RequestMapping("/about/team")
	public String getAboutTeamPage(ModelMap model) {
		model.addAttribute("title", "Our Team");
		return "aboutTeam";
	}

	@RequestMapping("/about/office")
	public String getAboutOfficetPage(ModelMap model) {
		model.addAttribute("title", "Our Office");
		return "aboutOffice";
	}

	@RequestMapping("/about/hengLim")
	public String getAboutHengLimpage(ModelMap model) {
		model.addAttribute("title", "About Dr.Heng Lim, DDS; LVIF");
		return "abouthengLim";
	}

	@RequestMapping("/caseHistory")
	public String getCaseHistoryPage(ModelMap model) {
		model.addAttribute("title", "Case History");
		return "caseHistory";
	}

	@RequestMapping("/caseHistory/detail")
	public String getcaseHistoryDetailPage(ModelMap model, @RequestParam String title) {
		model.addAttribute("title", title);
		return "caseHistoryDetail";
	}

	@RequestMapping("/contact")
	public String getContactPage(ModelMap model) {
		model.addAttribute("title", "Contact");
		return "contact";
	}
	

	@RequestMapping("/smileGallery")
	public String getSmileGalleryPage(ModelMap model) {
		model.addAttribute("title", "Smile Gallery");
		return "smileGallery";
	}
	
	@RequestMapping("/oral-conscious-sedation")
	public String getOralConsciousSedationPage ( ModelMap model){
		model.addAttribute("title", "Oral Conscious Sedation");
		return "oralConsciousSedation";
	}

	@RequestMapping("/neuromuscular-dentistry-FAQ")
	public String getNeuromuscularDentistryFAQPage ( ModelMap model){
		model.addAttribute("title", "Neuromuscular Dentistry FAQ's");
		return "neuromuscularDentistryFAQ";
	}
	
	
	@RequestMapping("/testimonial")
	public String getTestimonialPage(ModelMap model) {
		model.addAttribute("title", "Testimonial");
		return "testimonial";
	}

	@RequestMapping("/service")
	public String getServicePage(ModelMap model) {
		model.addAttribute("title", "Services");
		return "service";
	}

	@RequestMapping("/service/detail")
	public String getServicePage(ModelMap model, @RequestParam String title) {
		model.addAttribute("title", title);
		return "serviceDetail";
	}

	@RequestMapping("/blog")
	public String getBlogPage(ModelMap model) {
		model.addAttribute("title", "Blog");
		return "blog";
	}

	@RequestMapping("/blog/detail")
	public String getBlogPage(ModelMap model, @RequestParam String title) {
		model.addAttribute("title", title);
		return "blogDetail";
	}
	/*
	 * @RequestMapping("/login") public String getLoginPage(ModelMap model) {
	 * return "login"; }
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {

		if (error != null) {
			model.addAttribute("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addAttribute("msg", "You've been logged out successfully.");
		}
		return "login";

	}
	
	

}
