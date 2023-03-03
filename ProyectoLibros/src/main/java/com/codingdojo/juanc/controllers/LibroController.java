package com.codingdojo.juanc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.juanc.models.Libro;
import com.codingdojo.juanc.services.LibroServicio;

@Controller
public class LibroController {
	
	@Autowired LibroServicio libroServicio;
	
	@GetMapping("/libros")
	public String todosLosLibros(Model model) {
		
		List<Libro> libros = libroServicio.todosLosLibros();
		model.addAttribute("ListaLibros", libros);
		
		return "showAll.jsp";
	}
	
	@GetMapping("/libros/{id}")
	public String buscarLibroId(Model model,
							@PathVariable("id") Long id) {
		
		Libro libro = libroServicio.buscarLibroId(id);
		
		model.addAttribute("Libro", libro);
		
		return "show.jsp";
	}
}
