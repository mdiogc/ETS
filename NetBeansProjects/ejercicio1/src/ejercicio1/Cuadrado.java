
package ejercicio1;


public class Cuadrado {
    //Atributos
    private float lado1;
    private float lado2;
    
    //Métodos
    
    //Métodos constructor cuadrado 1
    public Cuadrado(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Métodos constructor cuadrado 2
    public Cuadrado(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    public float getPerimetro(){
        float perimetro = 2 * (lado2 + lado1);
        return perimetro;
}
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    } 
        
    }


