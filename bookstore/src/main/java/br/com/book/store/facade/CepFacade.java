package br.com.book.store.facade;

import br.com.book.store.service.CepService;

public class CepFacade {

    public String buscarCep(String cep){

        return CepService.buscarCep(cep);
    }
}
