package com.example.demo.service;

import com.example.demo.modelo.Paciente;

public interface IPacienteService {
	
	public void insertar(Paciente paciente);
	
	public void actualizar(Paciente paciente);
	
	public Paciente buscar(Integer id);
	
	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);

}
