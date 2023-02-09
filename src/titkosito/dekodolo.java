
package titkosito;

public class dekodolo {
    private String szo;
    int szam = 3;
    
    public String dekodolo(String szo){
        
        char[] tomb = szo.toCharArray();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] =(char)(tomb[i]-2);
        }
        return new String(tomb);
    }
}
