package Utils;

import javax.swing.*;

public class Mensagens {
    public static void programaFinalizado(){
        JOptionPane.showMessageDialog(
                null,
                "Programa Finalizado",
                "Menu",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void programaConcluido(){
        JOptionPane.showMessageDialog(
                null,
                "Programa Concluido",
                "Menu",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
