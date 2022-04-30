/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
import javax.swing.JOptionPane;


/**
 *
 * @author Yosmeri C. Cruz
 */
public class Circulo extends FigurasGeometricas{
    
    @Override
    public void AreaF ()
    {
        
        System.out.println("Area del circulo");
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circuo"));
        
        Area = Math.PI *Math.pow(radio, 2);
            System.out.println("Radio" +radio);
            System.out.println("Formula = PI *Radio^2 ");
             
        System.out.println("El area del Circulo es: "+Area);
            
           
        
    }
    
}
