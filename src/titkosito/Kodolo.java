/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titkosito;


public class Kodolo {
    private String szo;
    private int szam = 3;
    
    public String kodol(String szo){
        char[] tomb = szo.toCharArray();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (char)(tomb[i]+2);
        }
        return new String(tomb);
    }
    
    
    
}
