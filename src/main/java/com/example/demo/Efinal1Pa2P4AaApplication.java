package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.service.ICitaMedicaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class Efinal1Pa2P4AaApplication implements CommandLineRunner{

	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Doctor d=new Doctor();
		d.setApellido("Muzo");
		d.setCedula("1727193847");
		d.setCodigoSenecyt("belenmuzo13");
		d.setFechaNacimiento(LocalDate.of(1999, 11, 21));
		d.setGenero("Femenino");
		d.setNombre("Belen");
		d.setNumeroConsultorio("BM2");
		
		this.doctorService.insertar(d);
		
		
		Paciente p=new Paciente();
		p.setApellido("Andrango");
		p.setCedula("1713031191");
		p.setCodigoSeguro("AR1");
		p.setEstatura(1.50);
		p.setFechaNacimiento(LocalDate.of(2001, 9, 13));
		p.setGenero("Masculino");
		p.setNombre("Alex");
		p.setPeso(50.0);
		
		this.iPacienteService.insertar(p);
		
		
		Doctor dBus=this.doctorService.buscarPorCedula("1727193847");
		System.out.println(dBus);
		
		Paciente pBus=this.iPacienteService.buscarPorCedula("1713031191");
		System.out.println(pBus);
		
		
		
		
		
		CitaMedica c=new CitaMedica();
		c.setDiagnostico("Fuerte infeccion");
		c.setDoctor(dBus);
		c.setFecha(LocalDate.now());
		c.setValor(new BigDecimal(50));
		c.setLugar("Centro medico IESS");
		c.setNumero("cita123");
		c.setPaciente(pBus);
		
		this.citaMedicaService.insertar(c);
		
		
		CitaMedica cBus=this.citaMedicaService.buscarPorNumero("cita123");
		System.out.println(cBus);
		
		cBus.setDiagnostico("Infeccion cronica");
		cBus.setReceta("Paracetamol cada 8 horas");
		cBus.setFechaProxima(LocalDate.of(2023, 07, 03));
		this.citaMedicaService.actualizar(cBus);
		

	}

}
