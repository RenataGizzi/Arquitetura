/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Problema01 {

    private String nome;
    
     public String getNome() {
        return nome;
         
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String listagem(){  
      ArrayList<String> lista = new ArrayList<String>();
      lista.add(getNome());
      System.out.println("\n tamanho: " + lista.size());
      return Arrays.toString(lista.toArray());
   }
    
    public static void main(String[] args) {
        
         Scanner ler = new Scanner(System.in);
         ArrayList<String> lista = new ArrayList();
         
        System.out.println("Digite seu nome: ");
        //nome = ler.nextString();
        
   
        
    }
    
}
