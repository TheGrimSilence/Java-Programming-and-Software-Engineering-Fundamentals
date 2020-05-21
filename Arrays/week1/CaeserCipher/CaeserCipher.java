import edu.duke.*;

/**
 * Write a description of CaeserCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaeserCipher {
    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String shifted = alphabet.substring(key) + alphabet.substring(0,key);
        
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            int index = alphabet.indexOf(currChar);
            
            if (index != -1) {
                char newChar = shifted.charAt(index);
                
                encrypted.setCharAt(i, newChar);
            }
        }
        
        return encrypted.toString();
    }
    
    public void log(String args) {
        System.out.println(args);
    }
    
    public void main(String args) {
        int key= 17;
        
        log(encrypt(args, key));
    }
}
