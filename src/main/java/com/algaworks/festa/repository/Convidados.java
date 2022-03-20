package com.algaworks.festa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

	List<Convidado> findAllByOrderById();

}
