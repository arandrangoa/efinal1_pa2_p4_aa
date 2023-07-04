package com.example.demo.service;

import com.example.demo.modelo.Doctor;

public interface IDoctorService {
	
	
	public void insertar(Doctor doctor);
	
	public void actualizar(Doctor doctor);
	
	public Doctor buscar(Integer id);
	
	public void eliminar(Integer id);
	
	public Doctor buscarPorCedula(String cedula);
	

}
