package com.codingdojo.juanc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.juanc.models.Libro;
import com.codingdojo.juanc.services.LibroServicio;

@RestController
@RequestMapping("/api")
public class LibroAPIController {

	@Autowired
	private LibroServicio libroServicio;
	
	@GetMapping("/libros")
	public List<Libro> muestraLibros(){
		return libroServicio.todosLosLibros();
	}
	
	@PostMapping("/libros")
	public Libro crearLibro(@RequestParam(value="titulo") String titulo,
							@RequestParam(value="descripcion") String descripcion,
							@RequestParam(value="idioma") String idioma,
							@RequestParam(value="numeroDePaginas") Integer numeroDePaginas) {
		Libro nuevoLibro = new Libro(titulo, descripcion, idioma, numeroDePaginas);
		return libroServicio.crearLibro(nuevoLibro);
	}
	
	@GetMapping("/libros/{id}")
	public Libro buscarId(@PathVariable("id") Long id) {
		return libroServicio.buscarLibroId(id);
	}
	
	@PutMapping("/libros/{id}")
	public Libro actualizarId(@PathVariable("id") long id,
							@RequestParam(value="titulo") String titulo,
							@RequestParam(value="descripcion") String descripcion,
							@RequestParam(value="idioma") String idioma,
							@RequestParam(value="numeroDePaginas") Integer numeroDePaginas) {
		
		Libro libroActualizado = new Libro(id, titulo, descripcion, idioma, numeroDePaginas);
		
		return libroServicio.actualizarLibro(libroActualizado);
	}
	
	@DeleteMapping("/libros/{id}")
	public void eliminarLibroId(@PathVariable("id") Long id) {
		libroServicio.eliminarLibro(id);
	}
}
