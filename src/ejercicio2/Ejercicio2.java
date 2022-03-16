package ejercicio2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Ejercicio2 {

    public static void main(String[] args) {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Inserte la longitud del vector"));
        int longitudContra = Integer.parseInt(JOptionPane.showInputDialog("Inserte la longitud de las contraseñas"));
        Password[] passwords = new Password[longitud];
        boolean[] fuerte = new boolean[longitud];
        JTextArea hoja = new JTextArea();
        String cadena = "";
        for (int i = 0; i < longitud; i++) {
            passwords[i] = new Password(longitudContra);
            passwords[i].generarPassword();
            fuerte[i] = passwords[i].esFuerte();
            cadena = cadena+"Contraseña "+Password.getContador()+":\t"+passwords[i].getContraseña()+"\t"+fuerte[i]+"\n";
            System.out.println(fuerte[i]);
            System.out.println("\n");
        }
        hoja.setText(cadena);
        JOptionPane.showMessageDialog(null,hoja);
    }
}
