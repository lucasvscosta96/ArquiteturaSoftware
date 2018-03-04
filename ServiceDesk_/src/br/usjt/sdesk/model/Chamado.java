package br.usjt.sdesk.model;

import java.util.Date;

public class Chamado {


	private int id;
	private Date dataAbertura;
	private Date dataFechamento;
	private String descricao;
	private String status;
	public static final String ABERTO = "aberto";
	public static final String FECHADO = "fechado";
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public Date getDataFechamento() {
		return dataFechamento;
	}
	
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String Status() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void tempoChamado() {
		int dias;		
		if(getDataFechamento() == null) {
			dias = (int) (System.currentTimeMillis() - dataAbertura.getTime()) 
					/ (1000 * 60 * 60 *40);
		}else {
			dias = (int) (dataFechamento.getTime() - dataAbertura.getTime());
		}
	}
	
	
	
}
