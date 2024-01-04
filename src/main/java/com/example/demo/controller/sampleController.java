package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.SampleDTO;

@Controller // 컨트롤러 역할으로 지정됨
@RequestMapping("/sample") // 중간경로.   :  URL =  ~~/중간경로/마지막경로
public class sampleController {

	@GetMapping("/ex1")
	public void ex1() { //사용자 요청 처리 method (sample/ex1)
		//리턴타입이 void인 경우, 자동으로 url경로와 일치하는 html파일을 찾아 반환 (mvc에서 String으로 반환값->반환될 주소직접 입력. webapp폴더에서 jsp파일 찾음)
		
		//템플릿경로 : /templates/sample/ex1.html
		
	}	
	
	@GetMapping("/ex2")
	public void ex2(Model model) { // Model -> 'org.springframework.ui.Model' 임포트하기. Model은 컨트롤러에서 view로 전달되는 값 역할
	
//		model.addAttribute(String attributeName, @Nullable Object attributeValue); 
				// ㄴ .addAttribute -> model에 특성 담음. (변수이름, 데이터[value])
		
		//모델에 문자열을 담기 (첫번째인자 : 변수명, 두번째인자 : 값)
		model.addAttribute("msg", "반갑습니다");
	}	
		
	@GetMapping("/ex3")
	public void ex3(Model model) {
		//모델에 문자열을 담기 (첫번째인자 : 변수명, 두번째인자 : 값)
		model.addAttribute("msg1", "안녕하세요");
		model.addAttribute("msg2", "반가워요");
				
	}	
	
	// -------------- p.10  DTO 시작
	@GetMapping("/ex4")
	public void ex4(Model model) {
	SampleDTO sampleDTO = SampleDTO.builder()
			.no(1).text("hello").regDate(LocalDate.of(2024, 01, 04)).build();
	//				 = new SampleDTO(1, "hello", LocalDate.of(2024, 01, 04));
		
		model.addAttribute("dto", sampleDTO);
						// (변수이름, 변수에 들어갈 데이터)				
	}	
	
	@GetMapping({"/ex5", "/ex6", "/ex7"})//  /ex5나 /ex6 /ex7 끝주소 입력시 메서드 호출되도록
	public void ex5(Model model) {
	
			List<SampleDTO> list = new ArrayList<>();
			
				list.add(new SampleDTO(1, "aaa", LocalDate.now()));
				list.add(new SampleDTO(2, "bbb", LocalDate.now()));
				list.add(new SampleDTO(3, "ccc", LocalDate.now()));
				
			model.addAttribute("list", list);
							// (변수이름, 변수에 들어갈 데이터-숫자,문자열,map,list 등등. )			
	}	
}























