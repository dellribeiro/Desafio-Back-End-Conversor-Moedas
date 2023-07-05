package Moedas;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class ConversorDeMoedas {
    public static void conversorMoedas() {
        BigDecimal valorMonetario = solicitarValorMonetario();
        String tipoMoeda = tipoConversao();
        String simboloMoeda = obterSimboloMonetario(tipoMoeda);
        BigDecimal valorConvertido = realizarConversaoMoeda(valorMonetario, tipoMoeda);

        JOptionPane.showMessageDialog(
                null,
                "O valor da conversão é de " + simboloMoeda + valorConvertido);

    }

    private static BigDecimal solicitarValorMonetario(){
        BigDecimal valorMonetario = null;
        boolean entradaValida = false;
        do {
            try {
                String valorString = JOptionPane.showInputDialog("Insira um valor: ");
                valorMonetario = new BigDecimal(valorString);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        } while (!entradaValida);
        return valorMonetario;
    }

    private static String tipoConversao(){

        String[] moedas = {
                "De Reais a Dólares",
                "De Reais a Euros",
                "De Reais a Libras",
                "De Reais a Ienes",
                "De Reais a Won Coreano",
                "De Dólares a Reais",
                "De Euros a Reais",
                "De Libras a Reais",
                "De Ienes a Reais",
                "De Won Coreano a Reais"};

        String moedaSelecionada = (String) JOptionPane.showInputDialog(
                null,
                "Escolha a moeda para qual voce deseja girar seu dinheiro",
                "Moedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                moedas,
                moedas[0]
        );
        return moedaSelecionada;
    }

    private static String obterSimboloMonetario(String tipoConversao){
        switch (tipoConversao) {
            case "De Reais a Dólares":
                return "$";
            case "De Reais a Euros":
                return "€";
            case "De Reais a Libras":
                return "£";
            case "De Reais a Ienes":
                return "¥";
            case "De Reais a Won Coreano":
                return "₩";
            default:
                return "R$";
        }
    }

    private static BigDecimal realizarConversaoMoeda(BigDecimal valor, String tipoMoeda){
        BigDecimal valorConvertido = null;
        if(tipoMoeda != null){
            switch (tipoMoeda){
                case "De Reais a Dólares" :
                    valorConvertido = valor.multiply(new BigDecimal(0.21)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Reais a Euros" :
                    valorConvertido = valor.multiply(new BigDecimal(0.19)).setScale(2, RoundingMode.HALF_UP);
                case "De Reais a Libras" :
                    valorConvertido = valor.multiply(new BigDecimal(0.16)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Reais a Ienes" :
                    valorConvertido = valor.multiply(new BigDecimal(29.84)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Reais a Won Coreano" :
                    valorConvertido = valor.multiply(new BigDecimal(267.47)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Dólares a Reais" :
                    valorConvertido = valor.multiply(new BigDecimal(4.84)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Euros a Reais" :
                    valorConvertido = valor.multiply(new BigDecimal(5.27)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Libras a Reais" :
                    valorConvertido = valor.multiply(new BigDecimal(6.15)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Ienes a Reais" :
                    valorConvertido = valor.multiply(new BigDecimal(0.034)).setScale(2, RoundingMode.HALF_UP);
                    break;
                case "De Won Coreano a Reais" :
                    valorConvertido = valor.multiply(new BigDecimal(0.0037)).setScale(2, RoundingMode.HALF_UP);
                    break;

            }
        }
        return valorConvertido;
    }
}
