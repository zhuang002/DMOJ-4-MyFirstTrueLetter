/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirsttrueletter;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class MyFirstTrueLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++) {
            String word=sc.nextLine();
            System.out.println(uniqueLetter(word));
        }
    }

    private static char uniqueLetter(String word) {
        char[] ca=word.toCharArray();
        char c;
        for (int i=0;i<ca.length;i++) {
            c=ca[i];
            if (ca[i]==0) continue;
            ca[i]=0;
            boolean duplicate=false;
            for (int j=i+1;j<ca.length;j++) {
                if (ca[j]==c) {
                    ca[j]=0;
                    duplicate=true;
                }
            }
            if (!duplicate) return c;
        }
        return 0;
    }
    
}
