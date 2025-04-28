/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class EX10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        System.out.println("me diga um numero");
        for (int i = 0; i < n.length;i++)
        {
            n[i] = entrada.nextInt(); 
            if(n[i]< 0)
            {
                n[i] = 0;
            }
          
        }
        for(int j = 0; j < n.length;j++)
        {
            System.out.println(n[j]);
        }
    }
}
