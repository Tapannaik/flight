package com.xworkz.web.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String movie;
	private String time;
	private int tickets;
	private String theater;
	private String screen;

	public MovieDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", time=" + time + ", tickets=" + tickets + ", theater=" + theater
				+ ", screen=" + screen + "]";
	}
	
	
}
