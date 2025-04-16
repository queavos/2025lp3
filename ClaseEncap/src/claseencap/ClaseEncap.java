/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseencap;

/**
 *
 * @author ossva
 */
public class ClaseEncap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("carlos calas",
                22,
                "1234566");
        p1.toString();
        p1.setEdad(23);
        p1.toString();
    }

}
