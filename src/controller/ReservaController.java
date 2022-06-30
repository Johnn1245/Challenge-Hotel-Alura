package controller;

import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.Reserva;

public class ReservaController {

	private ReservaDAO reservaDAO;

	public ReservaController() {
		var factory = new ConnectionFactory();
		this.reservaDAO = new ReservaDAO(factory.recuperaConexion());
	}

	public List<Reserva> listar() {
		return reservaDAO.listar();
	}

	public void guardar(Reserva reserva) {
		reservaDAO.guardar(reserva);
	}

	public void actualizar(Reserva reserva) {
		reservaDAO.guardar(reserva);
	}

	public int eliminar(Integer id) {
		return reservaDAO.eliminar(id);
	}

	public Object buscarReserva(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object actualizar(Integer id, String fecha_entrada, String fecha_salida, Integer valor, String forma_pago) {
		// TODO Auto-generated method stub
		return null;
	}


}