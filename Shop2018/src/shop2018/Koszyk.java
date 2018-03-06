package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Koszyk {
    private List<Produkt> lista = new ArrayList();
    
    public void dodaj(Produkt p)
    {
        lista.add(p);
    }
    
    public BigDecimal doZaplaty()
    {
        BigDecimal sum = new BigDecimal(0);
        for(Produkt p : lista)
        {
            sum=sum.add(p.getCena());
        }
        return sum;
    }
    
    
}