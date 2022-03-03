/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author xXSorzXx
 */
public class Calculo {
    float altura;
    String color;
    String giro;
    
    public float area(float altura){
        float area = altura * altura;
        return area;
    }
    
    public float perimetro(float altura){
        float perimetro = altura * 4;
        return perimetro;
    }
    
    public float volumen(float altura){
        float volumen = altura * altura * altura;
        return volumen;
    } 
}
