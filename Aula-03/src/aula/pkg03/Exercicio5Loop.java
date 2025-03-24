/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg03;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio5Loop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        int nota1 = entrada.nextInt();
        System.out.println("Digite sua segunda nota");
        int nota2 = entrada.nextInt();
        if (nota1 >= 0 && nota1 <=10 && nota2 >=0 && nota2<=10)
        {
            double media = (nota1+nota2)/2;
            System.out.println("A média das suas notas é de:"+media);
        }   
        else{
            System.out.println("Alguma das notas inseridas é invalida");
        }
        System.out.println("'NOVO CÁLCULO (S/N)?'");
        char novo_calculo = entrada.next().toUpperCase().charAt(0);
        while(novo_calculo = "S")
       {
           
       }
    }
}