package uvsq.M1.td1.Exo3_2;
/**
 *  la classe Vendeur qui herite de la glasse enploye .
 * @author rachida
 **/
public class Vendeur extends Employe {
	/**
	 * le nombre de personnel qui sont sous order ce manger.
	 **/
	private int commission;
	/**
	 * Constructeur manager.
	 * <p>
	 * A la construction d'un objet Vendeur, en appelle la super
	 * classe Employe.
	 * </p>
	 * @param nom         le nom de Manger.
	 * @param prenom      Le prenom de Manger.
	 * @param age         L'age de Manger.
	 * @param anneeEntree L'annee d'entree de Manger pour travailler.
	 * @param moisEntree  Le mois d'entree de Manger pour travailler.
	 * @param anneeAct    L'annee actuelle.
	 * @param moisAct     Le mois actuelle.
	 * @param commision la commission d'un Manger.
	 * @see Manger#commission
	 */
	public Vendeur(final String nom, final String
			prenom, final int age, final int
			anneeEntree, final int moisEntree, final
			int anneeAct, final int moisAct, final int commision) {
		super(nom, prenom, age, anneeEntree
				, moisEntree, anneeAct, moisAct);
		this.commission = commision;
	}
	/**
	 * retouren la commission d'un vendeur.
	 * @return commission.
	 * @see commission
	 **/
	public final int getCommission() {
		return this.commission;
	}
	/**
	 * Elle calccule le salaire de manager de cette vendeur :
	 * son salaire d'un employe + ca commission.
	 * @return returen le salaire d'un vendeur.
	 * */
	@Override
	public final int calculeSlaire() {
		System.out.println("je suis un vendeur");
		return (super.calculeSlaire()) + this.commission;
	}
}
