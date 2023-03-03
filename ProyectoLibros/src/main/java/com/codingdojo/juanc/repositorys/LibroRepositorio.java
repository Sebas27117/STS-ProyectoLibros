package com.codingdojo.juanc.repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.juanc.models.Libro;

@Repository
public interface LibroRepositorio extends CrudRepository<Libro, Long> {
	
	List<Libro> findAll();
	
	//Libro findById(long id);

	List<Libro> findById(long id);
	
	List<Libro> findByTitulo(String titulo);
	
	List<Libro> findByNumeroDePaginas(Integer numeroDePaginas);
	
	Libro save(Libro nuevoLibro);
	
	//void deleteById(long id);
}

