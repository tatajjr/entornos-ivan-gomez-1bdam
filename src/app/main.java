package app;

import modelos.Circulo;
import modelos.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Circulo c1 = new Circulo();
        Rectangulo r2 = new Rectangulo(21, 34);
        Circulo c2 = new Circulo(20);

        System.out.println(c1);
        
        r2.calcularArea();
        c2.calcularPerimetro();
        
        r1.getAltura();
        
        c2.setRadio(4);
        
        System.out.println(c2.getRadio());
        
        
        
    }
}
