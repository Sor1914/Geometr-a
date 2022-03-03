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
public class Triangulo extends Calculo {
    float base;
    
    public float area(float altura, float base){
        float area = (altura * base)/2;
        return area;
    }
    
    @Override
    public float perimetro(float base){
        float perimetro = base * 3;
        return perimetro;
    }
    
    public float volumen(float altura, float base){
        float volumen = (float) (1/3 * (3.14 * (base/2.00) * (base/2.00) * altura));
        return volumen;
    } 
    
}
