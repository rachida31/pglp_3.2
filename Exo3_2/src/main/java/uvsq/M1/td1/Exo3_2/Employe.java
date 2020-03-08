package uvsq.M1.td1.Exo3_2;
import java.util.*;

public abstract class  Employe {
	
	

	protected String nom;
	protected String prenom;
	protected int  age;
	protected int salaire;
	protected int anneeEntree;
	protected int moisEntree;
	protected int anneeAct;
	protected int moisAct;
	public Employe(String nom, String prenom, int age, int anneeEntree, int moisEntree,int anneeAct,int moisAct) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.salaire=1500;
		this.anneeEntree=anneeEntree;
		this.moisEntree=moisEntree;	
		this.anneeAct=anneeAct;
		this.moisAct=moisAct;
	
	}
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

    if((((this.moisAct-this.moisEntree)==0) || ((this.moisAct-this.moisEntree)>0))& (this.anneeAct> this.anneeEntree)) {
    	return this.anneeAct-this.anneeEntree;

    }
    else
	return 0;
}
public int calculeSlaire() {
	return this.salaire+(20*this.calculAnnee());

}


}
