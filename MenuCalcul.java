/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pj_menu_calculs;
import java.util.Scanner;

/**
 *
 * @author keffalan
 */
public class MenuCalcul {

    private static float addition() {
        
        Scanner sc = new Scanner(System.in);
    
            float nb1;
            float nb2;
            float total;
            
            System.out.println("ADDITION");
            System.out.println(" ");
            System.out.println("Saisir un premier nombre :");
            nb1 = sc.nextInt();
            System.out.println("Saisir un deuxième nombre :");
            nb2 = sc.nextInt();
            
            total = nb1+nb2;
            
            System.out.println("Le résultat est : "+ total);
            
        return total;
        
    }
    
    private static float soustraction() {
        
        Scanner sc = new Scanner(System.in);
    
            float nb1;
            float nb2;
            float total;
            
            System.out.println("SOUSTRACTION");
            System.out.println(" ");
            System.out.println("Saisir un premier nombre :");
            nb1 = sc.nextInt();
            System.out.println("Saisir un deuxième nombre :");
            nb2 = sc.nextInt();
            
            total = nb1-nb2;
            
            System.out.println("Le résultat est : "+ total);
            
            
        return total;
        
    }
    
    private static float multiplication() {
        
        Scanner sc = new Scanner(System.in);
    
            float nb1;
            float nb2;
            float total;
            
            System.out.println("MULTIPLICATION");
            System.out.println(" ");
            System.out.println("Saisir un premier nombre :");
            nb1 = sc.nextInt();
            System.out.println("Saisir un deuxième nombre :");
            nb2 = sc.nextInt();
            
            total = nb1*nb2;
            
            System.out.println("Le résultat est : "+ total);
            
            
        return total;
        
    }
    
    private static float division() {
        
        Scanner sc = new Scanner(System.in);
    
            float nb1;
            float nb2;
            float total;
            
            System.out.println("DIVISION");
            System.out.println(" ");
            System.out.println("Saisir un premier nombre :");
            nb1 = sc.nextInt();
            System.out.println("Saisir un deuxième nombre :");
            nb2 = sc.nextInt();
            
            total = nb1/nb2;
            
            System.out.println("Le résultat est : "+ total);
            
            
        return total;
        
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int choix;
        
        System.out.println("Bienvenue dans le menu, choisissez une option :");
        System.out.println(" ");
        System.out.println("1 - Addition");
        System.out.println("2 - Soustraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        choix = sc.nextInt();
        
        switch (choix){
            case 1 : addition();
            break;
            case 2 : soustraction();
            break;
            case 3 : multiplication();
            break;
            case 4 : division();
            break;
        }

    }
    
}
