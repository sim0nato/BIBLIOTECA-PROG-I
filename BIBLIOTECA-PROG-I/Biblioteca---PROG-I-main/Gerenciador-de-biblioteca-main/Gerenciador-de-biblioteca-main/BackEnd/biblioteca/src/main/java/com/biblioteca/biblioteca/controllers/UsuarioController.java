package com.biblioteca.biblioteca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import com.biblioteca.biblioteca.entities.Usuario;
import com.biblioteca.biblioteca.repositories.UsuarioRepository;

@RestController
@AllArgsConstructor
public class UsuarioController {
    UsuarioRepository repos;

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios(){
        return repos.findAll();        
    } 

    @GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@PathVariable Long id){
        return repos.findById(id).get();        
    } 

    @PostMapping("/usuario")
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return repos.save(usuario);
    }
 
    @DeleteMapping("/usuario/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        repos.deleteById(id);
    }
}