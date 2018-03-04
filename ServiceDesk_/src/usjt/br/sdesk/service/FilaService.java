package usjt.br.sdesk.service;

import java.util.ArrayList;

import br.usjt.sdesk.dao.FilaDAO;
import br.usjt.sdesk.model.Fila;

public class FilaService {

	FilaDAO filaDAO;
	
	public ArrayList<Fila> listarFilas() {
		return filaDAO.listarFilas();
	}
}
