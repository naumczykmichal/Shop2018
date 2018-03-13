/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Warehouse {
    private List<Product> products= new ArrayList();
    
    public Warehouse()
    {
    products.add(new Product ("chleb",new BigDecimal("2.2")));
    products.add(new Product ("maslo",new BigDecimal("6.15")));
    products.add(new Product ("mleko",new BigDecimal("1.9")));
    products.add(new Product ("jogurt",new BigDecimal("0.95")));
    products.add(new Product ("śmietana",new BigDecimal("1.5")));
    
    }
    
    public Collection<Product> productsAvailable()
    {
        
        //Sprawdzenie dostepnych produktow
   return null;
    }
    public Collection<Product> productsSortedByName()
    {
       TreeSet<Product> set =new TreeSet();
       set.addAll(products);
       return set;
     
    }
     public Collection<Product> productsSortedByPrice()
    {
        PriceComparator c = new PriceComparator();
       TreeSet<Product> set =new TreeSet(c);
       set.addAll(products);
       return set;
    }
    public void doOrder(Cart cart)
    {
       //przejrzec z koszyka
        //znalezc odpowiedni produkt
        //w tym obiekcie zmniejszyc ilosc o jeden
        // dwie petle 
        
        
        
        
        
        
        
    }
    @Override
    public String toString(){
        return products.toString();
    }
    public static void main(String[] args){
        
        
        Warehouse w = new Warehouse();
        System.out.println(w);
         System.out.println(w.productsSortedByName());
         System.out.println(w.productsSortedByPrice());
         
        
    }
    }
    
    
 