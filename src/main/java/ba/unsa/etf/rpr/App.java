package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FiksniBroj fb = new FiksniBroj(Grad.SARAJEVO, "254-597");
        FiksniBroj fb1 = new FiksniBroj(Grad.valueOf("TUZLA"), "254-597");
        System.out.println(fb1.ispisi());
    }
}
