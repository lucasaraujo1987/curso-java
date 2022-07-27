/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("EM que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        System.out.println("Sua idade é " + i);
        if (i>=18){
            System.out.println("Maior de Idade");
        } else{
            System.out.println("Manor de Idade");
        }
    }
    
}
