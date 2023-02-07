package com.xworkz.nandish.component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.nandish.dto.BeverageDTO;
import com.xworkz.nandish.dto.ChatDTO;
import com.xworkz.nandish.dto.EducationDTO;
import com.xworkz.nandish.dto.FamilyDTO;
import com.xworkz.nandish.dto.MobileDTO;

@Component
@RequestMapping("/")
public class Nandish {

	public Nandish() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("email", "nandishat.xworkz@gamil.com");
		return "index.jsp";
	}

	@PostMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running onMobile");
		model.addAttribute("mobile", "8867211644");
		return "index.jsp";
	}

	@PostMapping("/adhar")
	public String onAdhar(Model model) {
		System.out.println("Running onAdhar");
		model.addAttribute("adhar", "855499444090");
		return "index.jsp";
	}

	@PostMapping("/age")
	public String onAge(Model model) {
		System.out.println("Runnign onAge");
		model.addAttribute("age", "24");
		return "index.jsp";
	}

	@PostMapping("/dob")
	public String onDob(Model model) {
		System.out.println("Running onDob");
		model.addAttribute("dob", "02-12-2023");
		return "index.jsp";
	}

	@PostMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running onSalary");
		model.addAttribute("salary", "20000");
		return "index.jsp";
	}

	@PostMapping("/friend")
	public String onFriends(Model model) {
		System.out.println("Running onFriends");
		List<String> ref = new ArrayList<String>();
		ref.add("Arun");
		ref.add("Ajay");
		ref.add("vijay");
		model.addAttribute("friend", ref);
		return "index.jsp";
	}

	@PostMapping("/place")
	public String onPlace(Model model) {
		System.out.println("Running onPlace");
		List<String> ref = new ArrayList<String>();
		ref.add("Mysore");
		ref.add("Bangalore");
		ref.add("Maglore");
		model.addAttribute("place", ref);
		return "index.jsp";
	}

	@PostMapping("/skill")
	public String onSkill(Model model) {
		System.out.println("Running onSkill");
		List<String> ref = new ArrayList<String>();
		ref.add("C");
		ref.add("java");
		ref.add("sql");
		ref.add("Servlet");
		model.addAttribute("skill", ref);
		return "index.jsp";
	}

	@PostMapping("/education")
	public String onEducation(Model model) {
		System.out.println("Running onEducation");
		EducationDTO dto = new EducationDTO();
		dto.setQualification("BE");
		dto.setUniversity("VTU");
		dto.setEngineeringCollege("Sambhram Institute of Technology");
		dto.setBranch("CSE");
		dto.setCgpa(6.8);
		dto.setPuCollege("Sri chaitanya");
		dto.setPuBranch("PCMB");
		dto.setPuPercentage(65.68);
		dto.setSchoolName("Mathma Gandhi School");
		dto.setSslcPercentage(87.88);
		model.addAttribute("info", dto);
		return "index.jsp";
	}

	@PostMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running onFamily");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("Thippeswamy S");
		dto.setFphoneNumber(9482266576L);
		dto.setMotherName("Jayapadma");
		dto.setMphoneNumber(8867211644L);
		dto.setParamnentAddress("Challakere");
		dto.setCurrentAddress("Challakere");
		dto.setNoOfPeople(4);
		dto.setPinCode(577522);
		dto.setMarried(false);
		model.addAttribute("fam", dto);
		return "index.jsp";
	}

	@PostMapping("/chats")
	public String onChats(Model model) {
		System.out.println("Runnning onChats");
		ChatDTO dto = new ChatDTO();
		dto.setAvailable(true);
		dto.setDistance(4);
		dto.setGoodForHealth(false);
		dto.setLocation("Bagalore");
		dto.setName("Panipuri");
		dto.setOwnerName("abc");
		dto.setPrice(40);
		dto.setShopName("Xyz");
		dto.setTastesGood(true);
		dto.setShopOpensAt(LocalTime.of(04, 00));
		dto.setShopClosesAt(LocalTime.of(10, 00));
		model.addAttribute("chat", dto);
		return "index.jsp";
	}

	@PostMapping("/drinks")
	public String onBeverage(Model model) {
		System.out.println("Running onBeverege");
		BeverageDTO dto = new BeverageDTO();
		dto.setAlcohol(true);
		dto.setBrand("coco cola");
		dto.setColor("black");
		dto.setGoodForHealth(false);
		dto.setMadeOfFruit(false);
		dto.setPrice(250);
		dto.setQuantity(100);
		dto.setTestesGood(true);
		model.addAttribute("drink", dto);
		return "index.jsp";
	}

	@PostMapping("/phone")
	public String onMobile1(Model model) {
		System.out.println("Running onMobile");
		MobileDTO dto = new MobileDTO();
		dto.setCompany("Realme");
		dto.setDualSim(true);
		dto.setModel("8S");
		dto.setNoOfSim(2);
		dto.setSimCompany("Airtel");
		model.addAttribute("sim", dto);
		return "index.jsp";
	}
}
