package com.biblioteca.biblioteca.repositories;

import com.biblioteca.biblioteca.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


}