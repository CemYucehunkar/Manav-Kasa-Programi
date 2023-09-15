import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double elma=3.67 ,armut=2.14, domates=1.11, muz=0.95, patlıcan=5, kg;

        Scanner girdi=new Scanner(System.in);
        System.out.print("Alınan Armut:");
        kg=girdi.nextDouble();

        System.out.print("Alınan Domates:");
        kg=girdi.nextDouble();

        System.out.print("Alınan Muz:");
        kg=girdi.nextDouble();

        System.out.print("Alınan Patlıcan:");
        kg=girdi.nextDouble();

        double toplam= kg*elma +  kg*armut + kg*domates + kg*muz + kg*patlıcan ;
        System.out.print("Toplam:"+toplam);



        }
    }
