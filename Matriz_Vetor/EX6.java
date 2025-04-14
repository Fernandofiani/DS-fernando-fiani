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
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        int cont_par = 0;
        int cont_imp = 0;
        for (int i = 0; i < n.length;i++)
        {
            System.out.println("me diga um numero");
            n[i] = entrada.nextInt(); 
            
        }
        for(int j = 0; j <n.length; j ++)
        {
            if (n[j]%2 != 0)
            {
            System.out.println(n[j-1]);
            }
        }
    }
}
