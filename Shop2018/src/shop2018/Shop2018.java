
package shop2018;

import java.math.BigDecimal;



public class Shop2018 {

 
  
    public static void main(String[] args) {

        
       Product chleb =new Product("chleb",new BigDecimal("2.2"));
       Product maslo=new Product("maslo",new BigDecimal("6.15"));
       Product mleko=new Product("mleko",new BigDecimal("1.9"));
       Product jogurt =new Product("jogurt",new BigDecimal("0.95"));
       
       
       Cart koszyk = new Cart();
       koszyk.add(chleb);
       koszyk.add(maslo);
       koszyk.add(mleko);
       koszyk.add(jogurt);
       koszyk.add(jogurt);
       
       System.out.println();
       System.out.println("Cena wynosi:"+koszyk.toPay()+"zł");
       
       System.out.println(koszyk);
       
       Warehouse w=new Warehouse();
       System.out.println(w);
       w.doOrder(koszyk);
       System.out.println(w);
       System.out.println("PRACA DOMOWA -------");
       
         w.getItems("mleko ").setCount(0);
        System.out.println(w.productsAvailable());
        
       
       
       

        
        
        
        
        
    }
    
}
