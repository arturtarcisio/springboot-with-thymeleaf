package com.arturtarcisio.springboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturtarcisio.springboot.entidades.Instituicao;

public interface RepositorioInstituicao extends JpaRepository<Instituicao, Long>{

}
