package controller;

import dao.UsuarioDAO;
import factory.ConnectionFactory;

public class UsuarioController {
private UsuarioDAO usuarioDAO;

public UsuarioController() {
	var factory = new ConnectionFactory();
	this.usuarioDAO = new UsuarioDAO(factory.recuperaConexion());
}

public String obtenerUserName() {
	return usuarioDAO.obtenerUserName();
}

public String obtenerPassword() {
	return usuarioDAO.obtenerPassword();
}

}