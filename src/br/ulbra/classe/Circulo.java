package br.ulbra.classe;

//* @author s.lucas

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

 
public class Circulo {
    public double raio;
    
public Circulo(){
    raio=1;
}  
DecimalFormat formatar = new DecimalFormat("0.0");

public void calcularPerimetro(){
    double p = 0;
    p = 2 *Math.PI * raio;
    JOptionPane.showMessageDialog(null,
            "O perimetro do circulo de raio "+ raio+ " é " +formatar.format(p));   
} 
 public String calcularArea(){
     double a = 0;
     a = 3.14 * (raio * raio);
     return " A área do circulo de raio " +raio+ " é " +formatar.format(a);  
 }   
   
public void calcularDiametro(){
    double d = 0;
    d = 2 *raio;
    JOptionPane.showMessageDialog(null,
        "O diametro docirculo de raio " +raio+ " é " +formatar.format(d));
    
} 
}
