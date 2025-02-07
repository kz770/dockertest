package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;


@Controller
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/book/list")
	public void list(Model m) {
		m.addAttribute("list",service.findAll());
	}
	
	@GetMapping("/book/insert")
	public void insertForm() {
	}
	
	@PostMapping("/book/insert")
	public String insertSubmit(Book b) {
		service.insert(b);
		return "redirect:/book/list";
	}
	
}
