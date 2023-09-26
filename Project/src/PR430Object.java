public final class PR430Object{
    
    private static PR430Object instance;
    private String nom ;
    private String cognom;
    private String edat;

    private PR430Object (String nom, String cognom, String edat) {
 
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static PR430Object getInstance(String nom, String cognom, String edat) {
       try{
            Thread.sleep(1000);
        }catch(InterruptedException ex) {
            ex.printStackTrace();
        }
                
        if (instance == null) {
            instance = new PR430Object(nom, cognom, edat);
        }
        return instance;
    }

    public String toString(){
        return "Nom: "+nom+"    Cognom: "+cognom+"  Edat: "+edat;
    }
}   

