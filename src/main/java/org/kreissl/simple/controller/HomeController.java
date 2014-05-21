package org.kreissl.simple.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
import static org.kreissl.simple.controller.View.HOME_URI;
import static org.kreissl.simple.controller.View.HOME_VALUE;

@Controller
public class HomeController {
	@RequestMapping(value=HOME_URI, produces={TEXT_HTML_VALUE})
	public String home(Model model, Principal principal){
		model.addAttribute("user", null == principal?"anon":principal.getName());
		return HOME_VALUE;
	}
}
