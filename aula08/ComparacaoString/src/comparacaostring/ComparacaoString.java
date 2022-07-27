/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author lukas
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Lucas";
        String nome2 = "Lucas";
        String nome3 = new String("Lucas");
        String res;
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        String res2;
        res2 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res2);
    }
    
}
