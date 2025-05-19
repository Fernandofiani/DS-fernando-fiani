/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios_variaveis;

/**
 *
 * @author CAMARGO
 */
public class ex3 {
    public static void main(String[] args) {
        
        
        String Nome_Vendedor = "Toninho";
        int salario = 10000;
        int vendas = 3500;
        float comissao;
        float salariototal;
        float Porc = 0.15f;
        comissao = vendas * Porc;
        salariototal= comissao + salario;
        
        System.out.println(Nome_Vendedor+" tem seu salario total de "+salariototal);
       
        
    }
}
