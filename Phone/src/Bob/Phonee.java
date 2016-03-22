package Bob;

import java.util.ArrayList;

/**
 * Write a description of class Phone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phonee
{
    // instance variables - replace the example below with your own
    private int x;
    private int batterie;
    private String modele;
    private String marque;
    
    private ArrayList<Acheteur> p = new ArrayList<Acheteur>();

    /**
     * Constructor for objects of class Phone
     */
    public Phonee()
    {
        // initialise instance variables
        x = 0;
        batterie = 0;
    }
    
    public ArrayList<Acheteur> getAcheteur(){
        return this.p;
    }
    
    public void setAcheteur(ArrayList<Acheteur> p1){
        this.p = p1;
    }
    
    public void setAcheteur(Acheteur p1){
        this.p.add(p1);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    

	private void printAcheteur() {
		ExtractDuCode();
	}

	private void ExtractDuCode() {
		for(int i = 0; i < this.getAcheteur().size() ; i++){
    		System.out.println( this.getAcheteur().get(i).getNom());
    	}
	}
    
    public int getBatterie()
    {
        return this.batterie;
    }
    
    public void setBatterie(int batterie)
    {
        this.batterie = batterie;
    }
    
    public String getModele()
    {
        return this.modele;
    }
    
    public void setModele(String modele)
    {
        this.modele = modele;
    }
    
    public String getMarque()
    {
        return this.marque;
    }
    
    public void setMarque(String marque)
    {
        this.marque = marque;
    }
    
    public int rechargerPhone()
    {
        this.batterie++;
        return 0; //return 0 si ok
    }
    
    
}
