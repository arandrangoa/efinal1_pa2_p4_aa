package com.example.demo.repository;

import com.example.demo.modelo.CitaMedica;

public interface ICitaMedicaRepo {
	
	public void insertar(CitaMedica cita);
	
	public void actualizar(CitaMedica cita);
	
	public CitaMedica buscar(Integer id);
	
	public void eliminar(Integer id);
	
	public CitaMedica buscarPorNumero(String numeroCita);


}
