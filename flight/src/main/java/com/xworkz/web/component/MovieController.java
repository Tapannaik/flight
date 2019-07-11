package com.xworkz.web.component;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.web.dto.MovieDTO;

@Component
@RequestMapping("/")
public class MovieController {

	public MovieController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/saveMovie.do")
	public String onSave() {
		System.out.println("invoked on save");
		return "/MovieSucess.jsp";
	}

	@RequestMapping("/movieBook.do")
	public String onSave(MovieDTO dto, Model model) {
		System.out.println("invoked on save");
		System.out.println("dto \t" + dto);
		model.addAttribute("movie", dto.getName());
		model.addAttribute("theater", dto.getTheater());
		model.addAttribute("timings", dto.getTime());
		model.addAttribute("screen", dto.getScreen());
		model.addAttribute("tickets", dto.getTickets());
		return "/MovieSucess.jsp";
	}

	@RequestMapping(value = "/movieBook.do", method = RequestMethod.POST)
	public String onBook(MovieDTO dto, Model model, HttpServletRequest request) {
		Enumeration<String> reqParams = request.getParameterNames();
		while (reqParams.hasMoreElements()) {
			System.out.println("Param names " + reqParams.nextElement());
		}
		System.out.println("invoked Book");
		System.out.println("dto \t" + dto);
		model.addAttribute("movieDTO", dto);
		return "/MovieSucess.jsp";
	}
}
