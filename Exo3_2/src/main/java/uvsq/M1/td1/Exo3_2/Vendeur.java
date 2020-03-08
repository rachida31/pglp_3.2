package uvsq.M1.td1.Exo3_2;

public class Vendeur  extends Employe{
private int commission;
	public Vendeur(String nom, String prenom, int age, int anneeEntree, int moinsEntre,int anneeAct,int moisAct,int commision) {
		super(nom, prenom, age, anneeEntree, moinsEntre,anneeAct,moisAct);
	this.commission=commision;
	}
	public int getCommission()
	{
		return this.commission;
	}
	@Override
	public	int calculeSlaire()
	{
		System.out.println("je suis un vendeur");
	return (super.calculeSlaire())+this.commission;
	}
}
