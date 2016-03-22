package Bob;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Write a description of class Acheteur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acheteur
{
    // instance variables - replace the example below with your own
    private int x;
    private String nom;
    
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private ArrayList<Phonee> p = new ArrayList<Phonee>();
    

    /**
     * Constructor for objects of class Acheteur
     */
    public Acheteur()
    {
        // initialise instance variables
        x = 0;
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
    
    public ArrayList<Phonee> getPhone(){
        return this.p;
    }
    
    public void setPhone(ArrayList<Phonee> p1){
        this.p = p1;
    }
    
    public void setPhone(Phonee p1){
        this.p.add(p1);
    }
    
    public int recharge(Phonee p1){
        if( p1.rechargerPhone() == 0){
            return 0;
        }else{
            return 1;
        }
     
    }
    
    @Override
    public boolean equals(Object obj) {
    	
    	Phonee p = (Phonee) obj;
    	
    	if(p.getAcheteur().size() == this.getPhone().size()){
    		return true;
    	}else{
    		return false;
    	}
    }
    
}
