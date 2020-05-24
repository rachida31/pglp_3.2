package uvsq.M1.td1.Exo3_2;
/**
 * la classe Manager qui herite de la glasse enploye .
 * @author rachida
 **/
public class Manager extends Employe {
	/**
	 *la commission d'un manger.
	 **/
	private int commission;
	/**
	 * le nombre de personnel qui sont sous order ce manger.
	 **/
	private int nbSousOrder;
	/**
	 * Constructeur manager.
	 * <p>
	 * A la construction d'un objet Manager, en appelle la super
	 * classe Employe.
	 * </p>
	 * @param nom         le nom de Manger.
	 * @param prenom      Le prenom de Manger.
	 * @param age         L'age de Manger.
	 * @param anneeEntree L'annee d'entree de Manger pour travailler.
	 * @param moisEntree  Le mois d'entree de Manger pour travailler.
	 * @param anneeAct    L'annee actuelle.
	 * @param moisAct     Le mois actuelle.
	 * @param commission la commission d'un Manger.
	 * @param nbSousOrder le nombre de personnel qui sont sous son order.
	 * @see Manger#commission
	 * @see Manger#nbSousOrder
	 */
	public Manager(final String nom, final String prenom, final int
			age, final int anneeEntree, final int
			moisEntree, final int anneeAct, final int
			moisAct, final int commission, final int
			nbSousOrder) {
		super(nom, prenom, age, anneeEntree, moisEntree
				, anneeAct, moisAct);
		this.commission = commission;
		this.nbSousOrder = nbSousOrder;
	}
	/**
	 * retouren la commission d'un manger.
	 * @return commission.
	 * @see commission.
	 **/
	public final int getCommission() {
		return this.commission;
	}
	/**
	 * retouren le nombre de personnel qui sont sous order ce manger.
	 * @return nbSousOrder.
	 * @see nbSousOrder.
	 **/
	public final int getNbSousOrder() {
		return this.nbSousOrder;
	}
	/**
	 * Elle calccule le salaire de manager de cette maniere:son salaire d'un
	 * employe + ca commission + (nombre de personnel qui sont sous
	 * son order * 100).
	 * @return returen le salaire d'un manager.
	 * */
	@Override
	public final int calculeSlaire() {
		final int prime = 100;
		System.out.println("je suis un manager");
		return (super.calculeSlaire()) + this.commission + this.
				nbSousOrder * prime;
	}

}
