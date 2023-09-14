/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class ProgramaCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        calculadoramedia mc = new calculadoramedia();
        
        Scanner sc = new Scanner(System.in);
        
        float soma, sub, mult, div, num1, num2;
        int opcao;
        
        System.out.print("você quer a:\nCalculadora comun(1)\nCalculadora cientifica(2)\nCalculadora de media(3)\nR: ");
        opcao = sc.nextInt();
        
        
        if(opcao == 1){
        System.out.print("digite um numero: ");
        num1 = sc.nextFloat();
        
        System.out.print("digite outro numero: ");
        num2 = sc.nextFloat();
        
        
        soma = cc.somar(num1, num2);
        sub = cc.subtrair(num1, num2);
        mult = cc.multiplicar(num1, num2);
        div = cc.dividir(num1, num2);
       
       
       
        System.out.println("Resultado da soma " + soma);
        System.out.println("Resultado da subtração " + sub);
        System.out.println("Resultado da multiplicação " + mult);
        System.out.println("Resultado da divisão " + div);
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        }
        if(opcao == 2){
        System.out.print("digite um numero para a raiz: ");
        Double num3 = sc.nextDouble();
        Double rq = cc.raizQuadrada(num3);
        System.out.println("o resultado da raiz é " + rq);
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("digite um numero: ");
        Double num4 = sc.nextDouble();
        System.out.print("digite uma potencia: ");
        Double num5 = sc.nextDouble();
        Double pow = cc.potencia(num4, num5);
        System.out.print("o resultado da potencia é " + pow);
        }
        if(opcao == 3){
            
            System.out.print("digite a quantidade de numeros para a media: ");
            int quantidade = sc.nextInt();
            
            System.out.print("Media aritimetica(A) ou ponderada(P)?\nR:");
            String opcao2 = sc.next().toLowerCase();
            if(opcao2.equals("a")){
                
            float media = mc.media(quantidade);
            System.out.println("O resultado da media aritimetica é " + media);
            
            }else if(opcao2.equals("p")){
                
        float mediaponderada = mc.mediaPonderada(quantidade);
        System.out.println("O resultado da media ponderada é " + mediaponderada);
          
        }else{
        System.out.print("Opção invalida, tente novamente");
        }
        
    }
    }
}
