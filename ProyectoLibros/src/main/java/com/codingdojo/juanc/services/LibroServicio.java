package com.codingdojo.juanc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.juanc.models.Libro;
import com.codingdojo.juanc.repositorys.LibroRepositorio;

@Service
public class LibroServicio {
	
	@Autowired
	private LibroRepositorio libroRepositorio;
	
	public List<Libro> todosLosLibros(){
		return libroRepositorio.findAll();
	}
	
	public Libro crearLibro(Libro libro) {
		return libroRepositorio.save(libro);
	}
	
	public Libro buscarLibroId(Long id) {
		return libroRepositorio.findById(id).orElse(null);
	}
	
	public void eliminarLibro(Long id) {
		libroRepositorio.deleteById(id);
	}
	
	public Libro actualizarLibro(Libro LibroActualizado) {
		return libroRepositorio.save(LibroActualizado);
	}
}
