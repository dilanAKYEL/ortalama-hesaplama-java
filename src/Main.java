import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //değişkenleri oluştur.
        int mat, fizik, kimya, turkçe, tarih, muzik;

        // Scanner sınıfı tanımladık
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz:");
        mat=inp.nextInt();

        //Kullanıcıdan değerleri al
        System.out.print("Fizik Notunuz:");
        fizik=inp.nextInt();

        //Kullanıcıdan değerleri al
        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();

        //Kullanıcıdan değerleri al
        System.out.print("Turkçe Notunuz:");
        turkçe=inp.nextInt();

        //Kullanıcıdan değerleri al
        System.out.print("Tarih Notunuz:");
        tarih=inp.nextInt();


        //Kullanıcıdan değerleri al
        System.out.print("Müzik Notunuz:");
        muzik=inp.nextInt();

        double ortalama= (mat+fizik+kimya+turkçe+tarih+muzik)/6.0;
        System.out.println("Derslerinizin ortalamasi = " + ortalama);
        boolean kosul1= ortalama<60;
        boolean kosul2= ortalama>=60;
        boolean sonuc = kosul1 || kosul2;
        String cevap = sonuc ? "Gecti" : "Kaldi";
        System.out.println(cevap);
    }
}
