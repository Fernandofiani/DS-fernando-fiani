/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class EX15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       int[] n = new int [10];
        for (int i = 0; i < n.length;i++)
        {
            n[i] = entrada.nextInt();
            if(i%2!=0){
               
                System.out.println("posiçao no vetor: impar "+ i +" | numeros impares: "+n[i]);
            } 
            
        }
        
        }
    }

