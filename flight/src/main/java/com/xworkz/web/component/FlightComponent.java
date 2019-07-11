package com.xworkz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FlightComponent {

	public FlightComponent() {
		System.out.println("created /t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/saveFlight.do")
	public String onSave() {

		System.out.println("invoked on save");
		return "/Servlet.jsp";
	}

	@RequestMapping("/saveFlight2.do")
	public String onSave(@RequestParam String name, @RequestParam int passanger, @RequestParam String airport,
			@RequestParam String arrival, @RequestParam String departure) {

		System.out.println(name + " " + passanger + " " + airport + " " + arrival + " " + departure);
		return "/Servlet.jsp";
	}
}
