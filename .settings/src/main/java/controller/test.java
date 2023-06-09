package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.User;
import service.UserService;

@Controller
@Validated
public class test {
	@Autowired
	private UserService userService;
	@RequestMapping("/")
	public String loginOrRegister(HttpServletRequest request,Model model) {
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getValue());
			}
		}
		model.addAttribute("user", new User());
		return "register";
	}
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user") User user,Model model,@RequestParam("confirm") String confirm,BindingResult bindingResult) {
		boolean c = bindingResult.hasErrors();
		if(c) {
			return "register";
		}
		System.out.println(c);
		userService.saveUser(user);
		model.addAttribute("user", user);
		return "home";
	}
//	@InitBinder
//	public void dataBinder(WebDataBinder dataBinder) {
//		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(false);
//		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
//	}
}
