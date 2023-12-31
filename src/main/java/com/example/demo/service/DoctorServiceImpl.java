package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Doctor;
import com.example.demo.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo doctorRepo;
	
	
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.insertar(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.actualizar(doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepo.eliminar(id);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscarPorCedula(cedula);
	}

}
