package com.biblioteca.biblioteca.repositories;

import com.biblioteca.biblioteca.entities.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long>{


}