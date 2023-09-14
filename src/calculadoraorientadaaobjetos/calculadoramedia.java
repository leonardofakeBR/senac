/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author leonardo.35903
 */
public class calculadoramedia {
    Scanner sc = new Scanner(System.in);
    public float media(int quantidade){
        float soma = 0;
        float[] nums = new float[quantidade];
        for(int i = 1; i <= quantidade; i++){
        
            System.out.print("digite o " + i + "° valor: ");
            nums[i - 1] = sc.nextFloat();
            
        }
        for(int i = 0; i < quantidade; i++){
        
        soma += nums[i];
        
        }
    return soma / quantidade;
    }
    public float mediaPonderada(int quantidade){
           float soma = 0, somapesos = 0;
        float[] nums = new float[quantidade];
        float[] pesos = new float[quantidade];
        for(int i = 1; i <= quantidade; i++){
        
            System.out.print("digite o " + i + "° valor: ");
            nums[i - 1] = sc.nextFloat();
            
            System.out.print("digite o " + i + "° peso: ");
            pesos[i - 1] = sc.nextFloat();
            
        }
        for(int i = 0; i < quantidade; i++){
        
        soma += (nums[i] * pesos[i]);
        somapesos += pesos[i];
        
        }
        return soma / somapesos;
    }
}
