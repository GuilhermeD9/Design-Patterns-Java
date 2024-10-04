package subsistema2.cep;

import one.digitalinovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Aracaju";
    }

    public String recuperarEstado(String estado) {
        return "Sergipe";
    }
}
