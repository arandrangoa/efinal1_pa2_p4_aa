package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cita);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cita);
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CitaMedica c=this.buscar(id);
		this.entityManager.remove(c);
	}

	@Override
	public CitaMedica buscarPorNumero(String numeroCita) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> query=this.entityManager.createQuery("select e from CitaMedica e where e.numero= :datoNumero",CitaMedica.class);
		query.setParameter("datoNumero", numeroCita);
		return query.getSingleResult();
	
	}

}
