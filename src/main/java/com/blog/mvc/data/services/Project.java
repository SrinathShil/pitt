package com.blog.mvc.data.services;

public class Project {

	private String description;


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		System.out.println("sets");
	}


	@Override
	public String toString() {
		return "Project [ description=" + description+"]";
	}

	
}
