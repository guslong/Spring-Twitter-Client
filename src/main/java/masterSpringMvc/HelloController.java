package masterSpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String returnResult(Model model) {
		model.addAttribute("message", "Hello from the controller");
		return "resultPage";
	}
}
