import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        double tutar, kdvOranı=0.18 , kdvtutar , kdvlitutar ;
        Scanner input= new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar=input.nextDouble();
        kdvtutar= tutar* kdvOranı;
        kdvlitutar= tutar + kdvtutar;
        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV oranı:" + kdvOranı);
        System.out.println("KDV tutarı:"+kdvtutar);
        System.out.println("KDV'li tutar:"+kdvlitutar);
    }


}
