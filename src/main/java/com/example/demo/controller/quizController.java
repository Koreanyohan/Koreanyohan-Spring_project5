package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/quiz") 
public class quizController {
	
	@GetMapping("/quiz1")
	public void quiz1(Model model) {
		model.addAttribute("name", "둘리");
		model.addAttribute("age", "20");
		model.addAttribute("address", "인천 구월동");
		
	}
	
	@GetMapping("/quiz2")
	public void quiz2(Model model) {
		model.addAttribute("title", "스프링부트웹프로젝트");
		model.addAttribute("author", "구멍가게 코딩단");
		model.addAttribute("publicatedDate", LocalDate.of(2023,12,25));		
										//시간까지 했으면 LocalDateTime
	}
	
	
	
}







