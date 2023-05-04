package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class OutputController {


		@GetMapping("/output")
		public String postOutput(Model model) {
	        model.addAttribute("previous", "入力画面へ戻る");
	        return "output.index";
		}
}
