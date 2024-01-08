

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/layout")
public class LayoutController {
	
	@GetMapping({"/ex1_layout", "/ex1_layout2", "/fragment2", "/fragment3", "/exSidebar"})
	// templates -> layout -> 파일들.html
	public void ex1() {	
				
	}
}
