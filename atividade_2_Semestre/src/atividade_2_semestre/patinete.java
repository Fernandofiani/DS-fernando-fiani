/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package atividade_2_semestre;

/**
 *
 * @author Fernando
 */
import java.util.Arrays;
import java.util.Scanner;
public class patinete {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        
        int[] notas1 = new int [4];
        int[]notas2 = new int[4];
                
        System.out.println("Digite as 4 notas do primeiro avaliador");
        for(int i = 0; i < 4;i ++){
            System.out.print("Nota "+( i + 1)+":");
            notas1[i]=Entrada.nextInt();
        }
        
        System.out.println("Digite as 4 notas do segundo avaliador");
        for(int i = 0; i < 4;i ++){
            System.out.print("Nota "+( i + 1)+":");
            notas2[i]=Entrada.nextInt();           
    }
         
         
        int[] Todas_Notas = new int [8];
        for(int i = 0; i < 4; i++) Todas_Notas[i] = notas1[i];
        for(int i = 0; i < 4; i++) Todas_Notas[i + 4] = notas2[i];
        
         Arrays.sort(Todas_Notas);
         
     int soma = 0;   
     for(int notas : Todas_Notas) soma += notas;
     int media = soma / Todas_Notas.length;
     
     System.out.println("\nNotas ordenadas: " + Arrays.toString(Todas_Notas));
        System.out.println("Média final: " + media);
}
}
