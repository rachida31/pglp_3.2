package uvsq.M1.td1.Exo3_2;

public class Vendeur  extends Employe{
private double commission;
	public Vendeur(String nom, String prenom, int age, int anneeEntree, int moinsEntre,double commision) {
		super(nom, prenom, age, anneeEntree, moinsEntre);
	this.commission=commision;
	}
	public double getCommission()
	{
		return this.commission;
	}
	@Override
	public	double calculeSlaire()
	{
	return (super.calculeSlaire())+this.commission;
	}
}
