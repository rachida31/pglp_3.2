package uvsq.M1.td1.Exo3_2;

public class Manager extends Employe {
private double commission;
private int nbSousOrder;
	public Manager(String nom, String prenom, int age, int anneeEntree, int moinsEntre,double commission,int nbSousOrder) {
		super(nom, prenom, age, anneeEntree, moinsEntre);
		this.commission=commission;
		this.nbSousOrder=nbSousOrder;
	}
	
	public double getCommission()
	{
		return this.commission;
	}
	public double getNbSousOrder()
	{
		return this.nbSousOrder;
	}
	@Override
	public	double calculeSlaire()
	{
	return (super.calculeSlaire())+this.commission+this.nbSousOrder*100;
	}

}
