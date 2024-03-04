
package ejercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Cuadrado c1;
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digita el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digita el lado2: "));

        if(lado1 == lado2){//Cuadrado
            c1 = new Cuadrado(lado1);
        }
        else{
            c1 = new Cuadrado(lado1, lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());

    }
    
}
