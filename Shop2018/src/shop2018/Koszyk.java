
package shop2018;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private List<Produkt> lista = new ArrayList();
    
    public void dodaj(Produkt p)
    {
        lista.add(p);
    }
    
    public double doZaplaty()
    {
        double suma = 0;
        for (Produkt p : lista)
        {
           suma+=p.gCena();
        }
        return suma;
    }
    
}
