/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author oscar
 */
public class Validaciones {

    public boolean validarNombre(String nom) {
        boolean r = false;
        int c = 0;
        for (int i = 0; i < nom.length(); i++) {
            if ((nom.codePointAt(i) >= 97 && nom.codePointAt(i) <= 122)
                    || (nom.codePointAt(i) >= 65 && nom.codePointAt(i) <= 95)
                    || (nom.codePointAt(i) == 32)) {
                c++;

            }
        }
        if (c == nom.length()) {
            r = true;
        } else {
            r = false;
        }
        return r;

    }

    public boolean validarEdad(String edad) {
        boolean r = false;
        try {
            int a = Integer.parseInt(edad);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;

    }

    public boolean validarAltura(String alt) {
        boolean r = false;
        try {
            int a = Integer.parseInt(alt);
            r = true;
        } catch (Exception e) {
            r = false;
        }
        return r;

    }
}
