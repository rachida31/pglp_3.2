package uvsq.M1.td1.Exo3_2;
import java.util.*;
import static java.lang.System.*;

public class Employe {
	
	

	protected String nom;
	protected String prenom;
	protected int  age;
	protected double salaire;
	protected int anneeEntree;
	protected int moisEntree;
	
	public Employe(String nom, String prenom, int age, int anneeEntree, int moisEntre) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.salaire=1500;
		this.anneeEntree=anneeEntree;
		this.moisEntree=moisEntree;	}
	public int getAnneeEntree()
	{
		return this.anneeEntree;
	}
	public String getNom()
	{
		return this.nom;
	}	

	public String getPrenom()
	{
		return this.prenom;
	}	
	public int getAge()
	{
		return this.age;
	}	
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom=prenom;
	}public void setAge(int age)
	{
		this.age=age;
	}
	public double getSalaire()
	{
		return this.age;
	}	

private int calculAnnee()
{
    Calendar date = Calendar.getInstance();
    if(((date.MONTH-this.moisEntree)==0) & (date.YEAR> this.anneeEntree)) {
    	return date.YEAR-this.anneeEntree;

    }
    else
	return 0;
}
public double calculeSlaire() {
	return this.salaire+(20*this.calculAnnee());

}


}
