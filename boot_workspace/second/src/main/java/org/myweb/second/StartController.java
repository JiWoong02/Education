package org.myweb.second;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartController {
	
	
	 @RequestMapping("/")
     @ResponseBody
     public String home(){
         return "hello, springboooooooooooooot!";
     }
	 @RequestMapping("/menu")
		public String menu(Model model){
			model.addAttribute("test", "Springboooooooooooooooot");
			return "common/menu";
		}    

}