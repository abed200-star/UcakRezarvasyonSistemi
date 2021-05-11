import java.util.Scanner;


public class javaProjem {
         
public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        UcakRezarvasyonSistemi pegasus = new Pegasus();
        UcakRezarvasyonSistemi thy = new Thy();
        
        int islem=0;
        do 
        {
            System.out.println("\nUcak Rezarvasyon Sistemine Hosgeldiniz:");
            System.out.println("musteri islemleri icin 1:");
            System.out.println("cikmak icin 2:");

            islem = myObj.nextInt();
            int islem2;
            switch(islem)
            {
                case 1:
                    System.out.println("THY dan bilet almak icin 1:");
                    System.out.println("pegasus dan bilet almak icin 2:"); 
                    islem2=myObj.nextInt();
                    if (islem2==1) {
                        thy.rezervasyonAl();
                        
                    }else if (islem2==2) {
                        pegasus.rezervasyonAl();
                    }     
                    break;
                    case 2:
                        System.out.println("Güle Güle");
                        break;
                default :System.out.println("yanlis giris");
                break;
            }
       } while (islem!=2);
          //int go=PRS.getKoltukSayisi();
          //System.out.println("getKoltukSayisi "+go);
          //System.out.println("getKoltukSayisi "+go);
    }
}