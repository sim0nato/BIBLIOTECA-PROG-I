package com.biblioteca.biblioteca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import com.biblioteca.biblioteca.entities.Livro;
import com.biblioteca.biblioteca.repositories.LivroRepository;

@RestController
@AllArgsConstructor
public class LivroController {
    LivroRepository repos;

    @GetMapping("/livros")
    public List<Livro> getAllLivros(){
       return repos.findAll();        
    } 

    @GetMapping("/livro/{id}")
    public Livro getLivroById(@PathVariable Long id){
       return repos.findById(id).get();        
    } 

    @PostMapping("/livro")
    public Livro saveLivro(@RequestBody Livro livro) {
        return repos.save(livro);
    }
 
    @DeleteMapping("/livro/{id}")
    public void deleteLivro(@PathVariable Long id) {
        repos.deleteById(id);
    }
}