/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Teste_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String[] nome = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(nome[1]);
        String[] sobrenome = {};
        for(int i = 0; i < nome.length; i++){
            System.out.println("diga um nome");
            int n = entrada.nextInt();
        }
        for(int j = 0; j < sobrenome.length;j++)
        {
            System.out.println(sobrenome[j]);
        }  
        
        for(int k = 0; k <nome.length; k ++){
        System.out.println("Seu nome e "+nome[k]+" "+ sobrenome[k]);
        }
    }
}
