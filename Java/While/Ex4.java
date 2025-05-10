/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos voce tem?");
        int alunos = entrada.nextInt();
        System.out.println("Entre com a nota final dos alunos");
        
        int i = 0;
        float media = 0;
        float nota_total = 0;
        while(i < alunos)
        {
            i+=1;
           float nota = entrada.nextFloat();
           nota_total += nota;
        }
        media = nota_total/alunos;
        System.out.println("A media da sala é de:"+media);
    }
}
