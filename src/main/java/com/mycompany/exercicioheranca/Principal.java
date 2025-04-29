package com.mycompany.exercicioheranca;

public class Principal {
    
    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        System.out.println("A área do triângulo é: " + triangulo.getArea());
        
        Circulo circulo = new Circulo("Branco ",3);
        circulo.leitura();
        System.out.println(circulo.paraString());
        System.out.println("A área do círculo é: " + circulo.getArea());
    }
}
