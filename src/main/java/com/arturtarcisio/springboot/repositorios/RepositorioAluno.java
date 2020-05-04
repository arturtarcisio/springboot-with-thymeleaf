package com.arturtarcisio.springboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturtarcisio.springboot.entidades.Aluno;

public interface RepositorioAluno extends JpaRepository<Aluno, Long>{

}
