package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="citaMedica")
public class CitaMedica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_cita")
	@SequenceGenerator(name = "seq_cita",sequenceName = "seq_cita", allocationSize = 1)
	@Column(name="cita_id")
	private Integer id;
	
	@Column(name="cita_numero")
	private String numero;
	
	@Column(name="cita_fecha")
	private LocalDate fecha;
	
	@Column(name="cita_valor")
	private BigDecimal valor;
	
	@Column(name="cita_lugar")
	private String lugar;
	
	@Column(name="cita_diagnostico")
	private String diagnostico;
	
	@Column(name="cita_receta")
	private String receta;
	
	@Column(name="cita_fecha_proxima")
	private LocalDate fechaProxima;
	
	@ManyToOne
	@JoinColumn(name="cita_id_doctor")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name="cita_id_paciente")
	private Paciente paciente;

	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getReceta() {
		return receta;
	}

	public void setReceta(String receta) {
		this.receta = receta;
	}

	public LocalDate getFechaProxima() {
		return fechaProxima;
	}

	public void setFechaProxima(LocalDate fechaProxima) {
		this.fechaProxima = fechaProxima;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", valor=" + valor + ", lugar="
				+ lugar + ", diagnostico=" + diagnostico + ", receta=" + receta + ", fechaProxima=" + fechaProxima
				+ ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}
	
	
	
	
	

}
