public class Pegasus  extends UcakRezarvasyonSistemi {
    
    Pegasus(){}
    
    Pegasus(int koltukSayisi){}
    
    @Override
    void rezervasyonAl()
    {
         int islem =0;
        if (!ucakDoluMu()) 
        {
            System.out.println("Buisness Class'da Bilet Almak Icin 1 Economy Class'da Bilet Almak Icin 2'i Giriniz :");
             islem = myObj.nextInt();
            switch(islem){
                case 1:
                     if (!businessDoluMu()) {
                    for (int i = 0; i < 5; i++) {
                        if (this.koltuklar[i]==false) {
                            this.koltuklar[i]=true;
                            System.out.println("\nBuisness Class'da "+(i+1)+". koltuga rezervasyon yaptiniz.\n");
                            break;
                        } 
                    }}
                     else System.out.println("Maalesef Buisness Class Dolu");
                    break;
                case 2:
                      if (!businessDoluMu()) {
                    for (int i = 5; i < 10; i++) {
                        if (this.koltuklar[i]==false) {
                            this.koltuklar[i]=true;
                            System.out.println("Economy Class'da "+i+". koltuga rezervasyon yaptiniz.");
                            break;
                        }  
                    }}
                     else System.out.println("Economy Buisness Class Dolu");
                    break;
                default : System.out.println("Hatali Giris Yaptiniz");
            }
        }
        else            
            System.out.println("Maalesef Ucagimiz Dolu");
    }
}