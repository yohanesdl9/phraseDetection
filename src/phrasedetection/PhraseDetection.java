/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrasedetection;

import java.util.ArrayList;

/**
 *
 * @author yohan
 */
public class PhraseDetection {

    public static void main(String[] args) {
        String kalimat = "pen pineapple apple pen pineapple";
        String[] phrases = detectPhrases(kalimat, 2);
        for (int i = 0; i < phrases.length; i++){
            System.out.println(phrases[i]);
        }
        System.out.println("Jumlah frasa : " + phrases.length);
    }
    
    public static String[] detectPhrases(String kalimat, int n){
        /* memecah kalimat menjadi daftar kata-kata yang dipisahkan spasi 
        terms = {"pen", "pineapple", "apple", "pen", "pineapple"}*/
        String[] terms = kalimat.split(" ");
        String[] phrases = new String[terms.length - n + 1];
        /* jumlah kata-kata unik dikurangi n untuk menghindari ArrayIndexOutOfBounds
        Exception */
        int max_index = terms.length - n + 1;
        for (int i = 0; i < max_index; i++){
            /* gabungkan terms indeks ke i dan terms indeks ke (i + (n - 1)),
            masukkan ke dalam ArrayList */
            phrases[i] = terms[i] + " " + terms[i + (n - 1)];
        }
        return phrases;
    }
    
}
