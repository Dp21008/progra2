package ejercicio2;

public class Password {

    private int longitud;
    private String contraseña;
    private int num = 0;
    private int mayus = 0;
    private int minus = 0;
    private static int contador = 0;

    public Password() {
        this.longitud = 8;
        Password.contador = Password.contador + 1;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        Password.contador = Password.contador + 1;
    }

    public String generarPassword() {
        int seleccionador;
        char caracter = 0;
        String contra = "";
        for (int i = 1; i <= this.longitud; i++) {
            seleccionador = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
            switch (seleccionador) {
                case 1 -> {
                    caracter = (char) (int) Math.floor(Math.random() * (57 - 48 + 1) + 48);
                    num = num + 1;
                }
                case 2 -> {
                    caracter = (char) (int) Math.floor(Math.random() * (90 - 65 + 1) + 65);
                    mayus = mayus + 1;
                }
                case 3 -> {
                    caracter = (char) (int) Math.floor(Math.random() * (122 - 97 + 1) + 97);
                    minus = minus + 1;
                }
            }
            contra = contra + caracter;
        }
        System.out.println("Contraseña " + (Password.contador) + ": " + contra);
        this.contraseña=contra;
        return contra;
    }

    public boolean esFuerte() {
        boolean fuerte = false;
        fuerte = this.num > 5 && this.mayus > 2 && this.minus > 1;
        return fuerte;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public static int getContador() {
        return contador;
    }

}
