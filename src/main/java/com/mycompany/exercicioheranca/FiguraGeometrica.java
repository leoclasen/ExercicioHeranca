package com.mycompany.exercicioheranca;
import javax.swing.*;

public class FiguraGeometrica {
    private String cor;
    
    public FiguraGeometrica() {
    this("");
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
   
    public void leitura() {
    setCor(JOptionPane.showInputDialog("Digite a Cor"));
    }
    
    public void imprimir() {
    JOptionPane.showMessageDialog
    (null,"A cor é " + getCor());
    }
    
    public String paraString() {
    return ("Cor : " + getCor());
    }
    
    public double getArea(){
        return 0;
    }
    
}
