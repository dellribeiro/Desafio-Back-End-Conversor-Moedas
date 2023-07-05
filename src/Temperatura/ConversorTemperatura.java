package Temperatura;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorTemperatura {
    public static void conversorTemperatura(){
        double temperatura = solicitarTemperatura();
        String tipoConversao = tipoConversao();
        char simboloEscala = obterSimboloEscala(tipoConversao);
        double valorConvertido = realizarConversaoTemperatura(temperatura, tipoConversao);

        DecimalFormat df = new DecimalFormat("#.#");
        String valorFormatado = df.format(valorConvertido);

        JOptionPane.showMessageDialog(
                null,
                "O valor da conversão é de " + valorFormatado + simboloEscala + "°");
    }


    private static double solicitarTemperatura(){
        double temperatura = 0d;
        boolean entradaValida = false;
        do {
            try {
                String temperaturaString = JOptionPane.showInputDialog("Insira uma temperatura: ");
                temperatura = Double.parseDouble(temperaturaString);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        } while (!entradaValida);
        return temperatura;
    }


    private static String tipoConversao(){

        String[] escala = {
                "De Celsius para Fahrenheit",
                "De Fahrenheit para Celsius"};

        String moedaSelecionada = (String) JOptionPane.showInputDialog(
                null,
                "Escolha um tipo de conversão",
                "Temperaturas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                escala,
                escala[0]
        );
        return moedaSelecionada;
    }

    private static char obterSimboloEscala(String tipoConversao){
        char simbolo = 0;
        switch (tipoConversao) {
            case "De Celsius para Fahrenheit":
                simbolo = 'F';
                break;
            case "De Fahrenheit para Celsius":
                simbolo = 'C';
        }
        return simbolo;
    }

    private static double realizarConversaoTemperatura(double temperatura, String tipoConversao){
        double valorConvertido = 0d;
        if(tipoConversao != null){
            switch (tipoConversao){
                case "De Celsius para Fahrenheit" :
                    valorConvertido = (temperatura * 9 / 5) + 32;
                    break;
                case "De Fahrenheit para Celsius":
                    valorConvertido = (temperatura - 32) * 5 / 9;
            }
        }
        return valorConvertido;
    }
}
