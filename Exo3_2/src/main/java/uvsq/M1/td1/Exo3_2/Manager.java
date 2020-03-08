package uvsq.M1.td1.Exo3_2;

public class Manager extends Employe {
private int commission;
private int nbSousOrder;
	public Manager(String nom, String prenom, int age, int anneeEntree, int moinsEntre,int anneeAct,int moisAct,int commission,int nbSousOrder) {
		super(nom, prenom, age, anneeEntree, moinsEntre,anneeAct,moisAct);
		this.commission=commission;
		this.nbSousOrder=nbSousOrder;
	}
	
	public int getCommission()
	{
		return this.commission;
	}
	public int getNbSousOrder()
	{
		return this.nbSousOrder;
	}
	@Override
	public	int calculeSlaire()
	{
		System.out.println("je suis un manager");
	return (super.calculeSlaire())+this.commission+this.nbSousOrder*100;
	}

}
