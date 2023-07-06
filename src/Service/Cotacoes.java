package Service;

import java.util.Map;

public class Cotacoes {

    private Map<String, Cotacao> cotacoes;

    public Map<String, Cotacao> getCotacoes() {
        return cotacoes;
    }

    public void setCotacoes(Map<String, Cotacao> cotacoes) {
        this.cotacoes = cotacoes;
    }

    public Cotacoes(Map<String, Cotacao> cotacoes) {
        this.cotacoes = cotacoes;
    }

    @Override
    public String toString() {
        return "cotacoes=" + cotacoes;
    }
}
