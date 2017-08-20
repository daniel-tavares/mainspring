package br.com.mainspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MensagemImpressao {

	
	IMensagemService iMensagemService;
	@ Autowired Pessoa diretor;
	

	@Autowired
	public MensagemImpressao(IMensagemService iMensagemService) {
		this.iMensagemService=iMensagemService;
	}

	public void imprimir() {
		System.out.println(iMensagemService.getMessage());
		System.out.println(diretor.toString());
	}

}
