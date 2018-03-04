package usjt.br.sdesk.service;

import java.util.Date;

import br.usjt.sdesk.dao.ChamadoDAO;
import br.usjt.sdesk.model.Chamado;

public class ChamadoService {

		ChamadoDAO chamadoDAO;
		
		public int abrirChamado(Chamado novoChamado) {
			novoChamado.setDataAbertura(new Date());
			novoChamado.setStatus(Chamado.ABERTO);
			novoChamado.setDataFechamento(null);
			
			return chamadoDAO.inserirChamado(novoChamado);
		}
		public void fecharChamado(ArrayList<>) {
			
		}
		
		public ArrayList<Chamado> consultarChamado() {
			return chamadoDAO.consultarChamado();
		}
		
		public ArrayList<Chamado> listarChamado() {
			return chamadoDAO.listarChamado();
		}
		
}
