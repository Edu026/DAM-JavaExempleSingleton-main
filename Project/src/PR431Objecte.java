import java.lang.reflect.Constructor;

public final class PR431Objecte{
    
    private static PR431Objecte instance;
    private static PR431Objecte instanceTwo;

    private String nom ;
    private String cognom;
    private String edat;

    private PR431Objecte (String nom, String cognom, String edat) {
 
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static PR431Objecte getInstance(String nom, String cognom, String edat) {
       try{
            Thread.sleep(1000);
        }catch(InterruptedException ex) {
            ex.printStackTrace();
        }
                
        if (instance == null) {
            instance = new PR431Objecte(nom, cognom, edat);
        }
        return instance;
    }

    public String toString(){
        return String.format("%-15s%-20s%-15s","Nom: "+nom,"Cognom: "+cognom,"Edat: "+edat);
    }

    public static PR431Objecte getNewDestroyedInstance(String nom, String cognom, String edat){
         try{
            Thread.sleep(1000);
        }catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            Constructor[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (PR431Objecte) constructor.newInstance(nom, cognom, edat);
                break;
            }
        } catch (Exception e) { e.printStackTrace(); }

        return instanceTwo;
    }
    
}   

