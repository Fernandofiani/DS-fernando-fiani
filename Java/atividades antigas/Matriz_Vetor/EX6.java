/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class EX6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       int[] n = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < n.length;i++)
        {
            if(i%2==0){
                i=i+1;
                System.out.println("posiçao no vetor: par "+ i +" | numeros pares: "+n[i]);
            } 
            
        }
        
        }
    }

