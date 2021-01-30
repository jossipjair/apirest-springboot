package com.hunter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hunter.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{

}
