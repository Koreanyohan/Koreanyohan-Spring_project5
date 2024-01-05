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
import com.example.demo.dto.Q6_PersonDTO;
import com.example.demo.dto.Q7_PersonDTO;

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
	
	@GetMapping ("/quiz5")
	public void quiz5(Model model) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};				
	
		model.addAttribute("numberList", arr);
	}
	
	@GetMapping ("/quiz6")
	public void quiz6(Model model) {
		List<Q6_PersonDTO> list = new ArrayList<>();
		 
		list.add(Q6_PersonDTO.builder()
				.name("둘리").age(20).address("인천 구월동").build());
		list.add(Q6_PersonDTO.builder()
				.name("또치").age(30).address("서울 신림동").build());
		list.add(Q6_PersonDTO.builder()
				.name("도우너").age(40).address("부산 문래동").build());
		
		model.addAttribute("personList", list);
	}		
	
	@GetMapping({"/quiz7", "/quiz8"})
	public void quiz7(Model model) {		
		List<Q7_PersonDTO> list = new ArrayList<>();
		
		list.add(Q7_PersonDTO.builder()
				.name("박하나").age(25).address("인천 구월동").build());
		list.add(Q7_PersonDTO.builder()
				.name("홍재범").age(17).address("서울 신림동").build());
		list.add(Q7_PersonDTO.builder()
				.name("문유리").age(31).address("부산 문래동").build());
		list.add(Q7_PersonDTO.builder()
				.name("김재민").age(8).address("인천 연수동").build());
		list.add(Q7_PersonDTO.builder()
				.name("장유라").age(33).address("부산 문래동").build());
		
		model.addAttribute("personData", list);
		
	}
	
}






