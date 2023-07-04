package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DoctorRepoImpl implements IDoctorRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Doctor d=this.buscar(id);
		this.entityManager.remove(d);
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery<Doctor> query=this.entityManager.createQuery("select e from Doctor e where e.cedula= :datoCedula",Doctor.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

}
