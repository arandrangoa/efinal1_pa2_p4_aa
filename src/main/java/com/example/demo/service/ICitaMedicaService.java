package com.example.demo.service;

import com.example.demo.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void insertar(CitaMedica cita);
	
	public void actualizar(CitaMedica cita);
	
	public CitaMedica buscar(Integer id);
	
	public void eliminar(Integer id);
	
	public CitaMedica buscarPorNumero(String numeroCita);

}
