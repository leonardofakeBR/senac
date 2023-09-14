/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraorientadaaobjetos;

/**
 *
 * @author leonardo.35903
 */
public class Calculadora {
    private float resultado;

    public Calculadora() {
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public float somar(float a, float b){
       // setResultado(a + b);
        return a + b;
       // setResultado(a + b);
    }
    
    public float subtrair(float a, float b){
       // setResultado(a - b);
        return a - b;
       // setResultado(a - b);
    }
    
    public float multiplicar(float a, float b){
       // setResultado(a * b);
        return a * b;
       // setResultado(a * b);
    }
    
    public float dividir(float a, float b){
        if(b != 0)
         //   setResultado(a / b);
            return a / b;
        else{
            System.out.println("Erro: divisão por zero!");
            //setResultado(Float.NaN);
            return Float.NaN;
        }
    }
}
