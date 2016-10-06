package com.elitedentalgroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {

	
	@RequestMapping({"","/patient-request"})
	public String getAdminHomePage(ModelMap model) {
		model.addAttribute("title", "Patient's Requests");
		return "adminHome";
	}
	
	@RequestMapping("/blog")
	public String getBlogFormPage(ModelMap model) {
		model.addAttribute("title", "Blog Form");
		return "blogForm";
	}
	@RequestMapping("/blogs")
	public String getBlogListPage(ModelMap model) {
		model.addAttribute("title", "Blog List");
		return "blogList";
	}
	
	@RequestMapping("/caseHistory")
	public String getCaseHistoryFormPage(ModelMap model) {
		model.addAttribute("title", "Case History Form");
		return "caseHistoryForm";
	}
	@RequestMapping("/caseHistories")
	public String getCaseHistoryListPage(ModelMap model) {
		model.addAttribute("title", "Case History List");
		return "caseHistoryList";
	}
	
	@RequestMapping("/service")
	public String getServiceFormPage(ModelMap model) {
		model.addAttribute("title", "Service Form");
		return "serviceForm";
	}
	
	@RequestMapping("/services")
	public String getServiceListPage(ModelMap model) {
		model.addAttribute("title", "Service List");
		return "serviceList";
	}
	
	
	
	@RequestMapping({"/patient-request/detail"})
	public String getRequestFormDetailPage(ModelMap model) {
		model.addAttribute("title", "Detail Patient's Requests");
		return "patientRequestDetail";
	}
	@RequestMapping(value = "/real-estate", method = RequestMethod.GET)
	public String getPITIRealEstatePage(ModelMap model) {
		model.addAttribute("title", "LIM REAL ESTATE,INC.");
		return "PITIRealEstate";

	}

	@RequestMapping(value = "/real-estate-auto", method = RequestMethod.GET)
	public String getPITIRealEstateAutoPage(ModelMap model) {
		model.addAttribute("title", "LIM REAL ESTATE,INC. Auto");
		return "PITIRealEstate2";

	}
}


