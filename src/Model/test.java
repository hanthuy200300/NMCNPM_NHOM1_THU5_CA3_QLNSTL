/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asus
 */
public class test {
    
    public static void main(String[] args) {
        String dy = "22/06/2000";
        String[] cat = dy.split("/");
        
        for (String string : cat) {
            System.out.println(string);
        }
    }
}
