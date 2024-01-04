package com.example.demo.controller;
// p.11&12 Q3,Q4

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//p.11 문제3~
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Q3_PersonDTO;
import com.example.demo.dto.Q4_BookDTO;
import com.example.demo.dto.SampleDTO;

@Controller
@RequestMapping("/quiz")
public class quizDtoController {

	@GetMapping("/quiz3")
	public void quiz3(Model model) {
		Q3_PersonDTO personDTO = Q3_PersonDTO.builder()
				.name("둘리").age(20).address("인천 구월동")
				.build();
		
		model.addAttribute("dto", personDTO);
	}	
	
	@GetMapping("/quiz4")
	public void quiz4(Model model) {
		Q4_BookDTO bookDTO = new Q4_BookDTO("스프링부트웹프로젝트", "구멍가게 코딩단", LocalDate.of(2022, 12, 25));
		
		model.addAttribute("dto", bookDTO);
	}	
}
