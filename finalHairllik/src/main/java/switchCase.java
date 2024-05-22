/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Excalibur
 */
public class switchCase {
    public static void main (String[] args){
        final char a='A', d='D';
        char grade ='B';
        
        switch(grade){
            case a:
            case 'B':System.out.println("great");
            case 'C':System.out.println("good");break;
            case d:
            case 'F':System.out.println("not good");
        }
    }
    
}
