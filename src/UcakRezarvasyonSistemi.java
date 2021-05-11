import java.util.Scanner;  

abstract public  class  UcakRezarvasyonSistemi  {
    protected int koltukSayisi;
    boolean[] koltuklar;
    protected Scanner myObj = new Scanner(System.in);
    
    UcakRezarvasyonSistemi()
    {
        setKoltukSayisi(10);
    }
    
    UcakRezarvasyonSistemi(int koltukSayisi)
    {
        
    }
    void setKoltukSayisi(int koltukSayisi)
    {
        this.koltukSayisi=koltukSayisi;
        this.koltuklar = new boolean[koltukSayisi];
    }
    
    int getKoltukSayisi(){
        return this.koltukSayisi;  
    }
    
    boolean ekonomiDoluMu()
    {    
        for (int i = 5; i < this.koltuklar.length; i++) {
            if (this.koltuklar[i]==false)
                   return false;
        }
     return true;
    }
    
    boolean businessDoluMu()
    {  
        for (int i = 0; i < 5; i++) 
            if (this.koltuklar[i]==false)
                   return false;
        
     return true;
    }
   
    boolean ucakDoluMu(){
        for (int i = 0; i < this.koltuklar.length; i++) {
            if (this.koltuklar[i]==false)
                   return false;
        }
        return true;
    }
    
    abstract void rezervasyonAl();
}