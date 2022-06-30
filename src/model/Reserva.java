package model;

import java.sql.Date;

public class Reserva {
private Integer id;
private String nombre;
private String apellido;
private String fechaNacimiento;
private String nacionalidad;
private String telefono;
private Integer idReserva;

public Reserva(String nombre, String apellido, String fechaNacimiento, String nacionalidad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
	this.nacionalidad = nacionalidad;

}

public Reserva(Integer id, String nombre, String apellido, String fechaNacimiento, String nacionalidad, String telefono, int idReserva) {
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
	this.nacionalidad = nacionalidad;
	this.telefono = telefono;
	this.idReserva = idReserva;
}

public Reserva(String string, String string2, String string3, String string4, int int1) {
	// TODO Auto-generated constructor stub
}

public Reserva(Date valueOf, Date valueOf2, String text, String string) {
	// TODO Auto-generated constructor stub
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getIdReserva() {
	return idReserva;
}

public void setIdReserva(Integer idReserva) {
	this.idReserva = idReserva;
}

public String getNombre() {
	return nombre;
}

public String getApellido() {
	return apellido;
}

public String getFechaNacimiento() {
	return fechaNacimiento;
}

public String getNacionalidad() {
	return nacionalidad;
}

public String getTelefono() {
	return telefono;
}

public Object getFormaPago() {
	// TODO Auto-generated method stub
	return null;
}

public Object getValor() {
	// TODO Auto-generated method stub
	return null;
}

public Object getFechaSalida() {
	// TODO Auto-generated method stub
	return null;
}

public Object getFechaEntrada() {
	// TODO Auto-generated method stub
	return null;
}

}