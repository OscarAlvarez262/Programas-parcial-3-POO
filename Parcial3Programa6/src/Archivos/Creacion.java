package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Creacion {

    public static void main(String[] args) {
        try {
            String r = "n";
            FileWriter archivo = new FileWriter("datos.txt");
            do {
                archivo.write(JOptionPane.showInputDialog("Escribe un dato") + "\n");
                r = JOptionPane.showInputDialog("Deseas otro dato");

            } while (r.equals("s"));

            archivo.close();
        } catch (IOException ex) {

        }

    }
}
