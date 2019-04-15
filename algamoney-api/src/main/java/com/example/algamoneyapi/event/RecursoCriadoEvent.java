package com.example.algamoneyapi.event;


import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

public class RecursoCriadoEvent extends ApplicationEvent{

	private HttpServletResponse reposnse;
	private Long codigo;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
		super(source);
		this.reposnse = response;
		this.codigo = codigo;
		// TODO Auto-generated constructor stub
	}



	public HttpServletResponse getReposnse() {
		return reposnse;
	}



	public void setReposnse(HttpServletResponse reposnse) {
		this.reposnse = reposnse;
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	

}
