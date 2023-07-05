package Utils;

import javax.swing.*;

import static Utils.Mensagens.programaConcluido;
import static Utils.Mensagens.programaFinalizado;

public class Continuar {
    public static boolean desejaContinuar(){
        boolean continuar;
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?",
                "Continuar?",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        if(resposta == JOptionPane.YES_OPTION)
            continuar = true;
        else if(resposta == JOptionPane.NO_OPTION) {
            programaFinalizado();
            continuar = false;
        }
        else{
            programaConcluido();
            continuar = false;
        }
        return continuar;
    }
}
