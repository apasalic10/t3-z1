package ba.unsa.etf.rpr;

import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FiksniBroj fb = new FiksniBroj(Grad.TUZLA,"223-523");
        FiksniBroj fb1 = new FiksniBroj(Grad.TUZLA,"123-424");
        Imenik imenik = new Imenik();
        imenik.dodaj("Vedran", fb);
        imenik.dodaj("Almedin", fb1);


        char c = 'V';
        /*try{
            System.out.println(imenik.naSlovo(c));
        }catch (NotInMapException e){
            System.out.println(e.getMessage());
        }*/

        Set<TelefonskiBroj> skup = imenik.izGradaBrojevi(Grad.TUZLA);
        for(TelefonskiBroj broj : skup){
            System.out.println(broj.ispisi());
        }
    }
}
