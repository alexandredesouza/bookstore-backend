package br.com.book.store.service;

public class CepService {

    private static CepService instancia = new CepService();

    private CepService() {
        super();
    }

   public static String buscarCep(String cep){
        return "sucesso";
   }
}
