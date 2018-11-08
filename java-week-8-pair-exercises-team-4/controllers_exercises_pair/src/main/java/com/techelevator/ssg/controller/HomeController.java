package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}
	
	@RequestMapping("alienAge")
	public String displayAlienAge() {
		return "alienAge";
	}

	@RequestMapping("alienAgeResults")
	public String calculateAlienAge(HttpServletRequest request) {
		double planetAge = 0;
		String planetName = request.getParameter("genre");
		double earthAge = Double.parseDouble(request.getParameter("earthAge"));
		switch (planetName) {
		case "Mercury":
			planetAge = earthAge * 4.1525;
			break;
		case "Venus":
			planetAge = earthAge * 1.6256;
			break;
		case "Mars":
			planetAge = earthAge * 0.5317;
			break;
		case "Jupiter":
			planetAge = earthAge * 0.0843;
			break;
		case "Saturn":
			planetAge = earthAge * 0.0339;
			break;
		case "Uranus":
			planetAge = earthAge * 0.0119;
			break;
		case "Neptune":
			planetAge = earthAge * 0.0040;
		}
		request.setAttribute("arg0", planetAge);

		return "alienAgeResults";
	}

	@RequestMapping("alienWeight")
	public String displayAlienWeight() {
		return "alienWeight";
	}
	
	
	@RequestMapping("alienWeightResults")
	public String calculateAlienWeight(HttpServletRequest request) {
		double planetWeight = 0;
		String planetName = request.getParameter("genre");
		double earthWeight = Double.parseDouble(request.getParameter("earthWeight"));
		switch (planetName) {
		case "Mercury":
			planetWeight = earthWeight * 0.38;
			break;
		case "Venus":
			planetWeight = earthWeight * 0.91;
			break;
		case "Mars":
			planetWeight = earthWeight * 0.38;
			break;
		case "Jupiter":
			planetWeight = earthWeight * 2.54;
			break;
		case "Saturn":
			planetWeight = earthWeight * 1.08;
			break;
		case "Uranus":
			planetWeight = earthWeight * 0.91;
			break;
		case "Neptune":
			planetWeight = earthWeight * 1.19;
		}
		request.setAttribute("planetWeight", planetWeight);

		return "alienWeightResults";
	}

	@RequestMapping("alienDriveTime")
	public String displayAlienDriveTime() {
		return "alienDriveTime";
	}
	
	
	@RequestMapping("alienDriveTimeResults")
	public String calculateAlienDriveTime(HttpServletRequest request) {
		int driveTimeInHrs = 0;
		double driveTimeInYears = 0;
		int distance = 0;
		int rateMPH = 0;
		String planetName = request.getParameter("planetName");
		String modeOfTrans = request.getParameter("modeSelect");
		double age = Double.parseDouble(request.getParameter("earthAge"));
		
		switch (planetName) {
		case "Mercury":
			distance = 56974146;
			break;
		case "Venus":
			distance = 25724767;
			break;
		case "Mars":
			distance = 48678219;;
			break;
		case "Jupiter":
			distance = 390674710;
			break;
		case "Saturn":
			distance = 792248270;
			break;
		case "Uranus":
			distance = 1692662530;
			break;
		case "Neptune":
			distance = 270395996;
			break;
		}
		
		switch (modeOfTrans) {
		case "Walking":
			rateMPH = 3;
			break;
		case "Car":
			rateMPH = 100;
			break;
		case "Bullet Train":
			rateMPH = 200;
			break;
		case "Boeing 747":
			rateMPH = 570;
			break;
		case "Concorde":
			rateMPH = 1350;
			break;
		}
		
		if (planetName.equals("Neptune")) {
			driveTimeInHrs = (distance / rateMPH) * 10;
		} else {
			driveTimeInHrs = distance / rateMPH;
		}
		
		driveTimeInYears = (double)driveTimeInHrs * 0.000114155;
		double newAge = age + driveTimeInYears;
		request.setAttribute("driveTime", driveTimeInYears);
		request.setAttribute("newAge", newAge);
		return "alienDriveTimeResults";
	}
	
	@RequestMapping("ssgForumOutput")
	public String displayForum() {
			return "ssgForumOutput";
		}

	}


