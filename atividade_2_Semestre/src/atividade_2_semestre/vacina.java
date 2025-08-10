/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_2_semestre;


import java.util.Scanner;
public class vacina {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        
        System.out.print("Quantos genes deseja analisar? ");
        int N = Entrada.nextInt();
        
        int[] genes = new int [N];
        
        System.out.println("Digite os " + N + " genes:");
        for(int i = 0; i < N; i ++)
        {
           genes[i] = Entrada.nextInt();
        }
        
        System.out.print("Digite o gene alvo para análise: ");
        int alvo = Entrada.nextInt();
        int cont = 0;
        
        for(int i = 0;i < N;i++)
        {
            if(genes[i] == alvo) {
                cont++;
            }
        }
        if(cont > 1){
            System.out.println("Achei o danado");
        }
        else if(cont == 1){
            System.out.println("Ainda não é o suficiente");
        }
        else{
            System.out.println("Sumiu!");
        }
    
        
    }
}

