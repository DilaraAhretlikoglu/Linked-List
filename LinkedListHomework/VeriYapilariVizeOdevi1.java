/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veriyapilarivizeodevi1;

/**
 *
 * @author Dilara
 */
import java.util.Scanner;
public class VeriYapilariVizeOdevi1 {

    public static class Balon {
        public int data; 
        public Balon next;

        public Balon(int pos) {
            data = pos;
            next = null;
        }
    }

    public static void balonPozisyonuBul(int m, int n) {
        // Dairesel bağlı listeyi oluştur
        Balon head = new Balon(1);
        Balon current = head;
        for (int i = 2; i <= n; i++) {
            Balon newBalloon = new Balon(i);
            current.next = newBalloon;
            current = newBalloon;
        }
        current.next = head; 

        // Patlatılacak balonların pozisyonunu belirleme
        int size = n; 
        current = head;
        Balon prev = null;
        int count = 1;

        // dairesel bağlı listedeki patlatılacak balonun indeksine erişme
        while (size > 1) {
            if (count == m) { 
                System.out.println(current.data + " numaralı balon patlatıldı.");
                prev.next = current.next; 
                current = prev.next; 
                count = 1; 
                size--; 
            } 
            else {
                prev = current;
                current = current.next;
                count++;
            }
        }

        System.out.println("Son kalan balonun pozisyonu: " + current.data);

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0, m = 0;
    int choice = 0;
        
        do {
            System.out.println("Balloon Pop Game");
            System.out.println("----------------");
            System.out.println("1. Başlat");
            System.out.println("2. Oyun Kuralları");
            System.out.println("3. Çıkış");
            System.out.print("Lütfen bir seçim yapın: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Oyun başlatılıyor...");
                    
                    while (n <= 0 || m <= 0) {
                    System.out.print("Lütfen balon sayısını (N) giriniz: ");
                    n = sc.nextInt();
                    System.out.print("Lütfen patlatılacak balonu (M) giriniz: ");
                    m = sc.nextInt();
        
                    // n veya m sıfır ya da negatifse kullanıcı uyarılır
                    if (n <= 0 || m <= 0) {
                        System.out.println("N ve M sıfırdan büyük tam sayı olmalıdır!");
            
                    }
            }
    
                    balonPozisyonuBul(m, n);
                    
                    break;
                    
                case 2:
                    System.out.println("Oyun Kuralları");
                    System.out.println("---------------");
                    System.out.println("1. Oyun, N adet balon ve M sayısında patlatılacak balon ile oynanır.");
                    System.out.println("2. Her turda, M sayısında bir balon patlatılır.");
                    System.out.println("3. Patlatılan balon listeden çıkarılır ve oyuncu diğer turda yeni bir balon patlatır.");
                    System.out.println("4. Oyuncu, listede sadece son kalan balon kalana kadar oyunu oynar.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                    break;
            }
            
        } while (choice != 3);
        
    }

    

}
