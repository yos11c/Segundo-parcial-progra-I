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
public class Cuadrado extends FigurasGeometricas {
    
    @Override
    public void AreaF ()
    {
        System.out.println("Area del Cuadrado");
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Lado del Cuadrado"));
        
        Area = lado * lado;
        
        System.out.println("Lado: " +lado);
        System.out.println("Formula: LADO * LADO");
        
        System.out.println("El area del cuadrado es: " +Area);
    }
}
