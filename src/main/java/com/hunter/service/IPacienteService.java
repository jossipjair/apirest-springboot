package com.hunter.service;

import java.util.List;

import com.hunter.model.Paciente;

public interface IPacienteService {

	Paciente registrar(Paciente p) throws Exception;

	Paciente modificar(Paciente p) throws Exception;

	List<Paciente> listar() throws Exception;

	Paciente listarPorId(Integer id) throws Exception;

	void eliminar(Integer id) throws Exception;

}
