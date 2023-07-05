import javax.swing.JOptionPane;


import static Moedas.ConversorDeMoedas.conversorMoedas;
import static Temperatura.ConversorTemperatura.conversorTemperatura;
import static Utils.Continuar.desejaContinuar;
import static Utils.Mensagens.programaFinalizado;


public class Main {
    public static void main(String[] args) {
        boolean continuar;
        do{
            String[] conversor = {"Conversor de Moeda", "Conversor de Temperatura"};

            String conversorSelecionado = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção",
                    "Menu",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    conversor,

                    conversor[0]
            );

            if(conversorSelecionado != null){
                if(conversorSelecionado.equals("Conversor de Moeda")){
                    conversorMoedas();
                    continuar = desejaContinuar();
                }
                else {
                    conversorTemperatura();
                    continuar = desejaContinuar();
                }
            }
            else{
                programaFinalizado();
                continuar = false;
            }
        }while (continuar);

    }
}