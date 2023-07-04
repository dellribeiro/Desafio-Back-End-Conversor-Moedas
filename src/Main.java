import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
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
    }
}