package uvsq.M1.td1.Exo3_2;

/**
 * <b>Cette classe décrit n'importe quelle type d'employe.</b>
 * <p>
 * La nous avant deux type d'Employe:
 * <ul>
 * <li>Vendeur</li>
 * <li>Manager</li>
 * </ul>
 * </p>
 * @author rachida ouchene
 * @version 4.1
 */
public abstract class Employe {
	/**
	 * nom c'est le nom de l'employe.
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#getNom()
	 */

	private String nom;
	/**
	 * prenom c'est le prenom de l'employe.
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#Prenom()
	 */

	private String prenom;
	/**
	 * age c'est l'age de l'employe .
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#getAge()
	 */

	private int age;
	/**
	 * salaire c'est le salaire initial de l'employer qui veut 1500$ .
	 * @see Employe#getSalaire()
	 */

	private int salaire;
	/**
	 * anneeEntree c'est l'annee dans la quelle l'enploye a commencer
	 * a travailler .
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#getAnneeEntree()
	 */

	private int anneeEntree;
	/**
	 * moisEntree c'est le mois dans la quelle l'enploye a commencer
	 * a travailler .
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#getMoisEntree()
	 */
	private int moisEntree;
	/**
	 * anneeAct c'est l'annee actuelle .
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#getAnneeAct()
	 */
	private int anneeAct;
	/**
	 * moisAct c'est le mois actuelle .
	 * @see Employe#Employe(String,String,int,int,int,int,int)
	 * @see Employe#getAnneeAct()
	 */
	private int moisAct;

	/**
	 * Constructeur Employe.
	 * <p>
	 * A la construction d'un objet Employe, le "salare" est fixé à 1500$,
	 * ce qui correspond au salaire initial.
	 * </p>
	 * @param nom         le nom de l'Employe.
	 * @param prenom      Le prenom de l'Employe.
	 * @param age         L'age de l'Employe.
	 * @param anneeEntree L'annee d'entree de l'Employe pour travailler.
	 * @param moisEntree  Le mois d'entree de l'Employe pour travailler.
	 * @param anneeAct    L'annee actuelle.
	 * @param moisAct     Le mois actuelle.
	 * @see Employe#nom
	 * @see Employe#prenom
	 * @see Employe#age
	 * @see Employe# salaire
	 * @see Employe#anneeEntree
	 * @see Employe#moisEntree
	 * @see Employe#anneeAct
	 * @see Employe#moisAct
	 */
	public Employe(final String nom, final String prenom, final int
			age, final int anneeEntree, final int moisEntree, final
			int anneeAct, final int moisAct) {
		final int slaireFixe = 1500;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.salaire = slaireFixe;
		this.anneeEntree = anneeEntree;
		this.moisEntree = moisEntree;
		this.anneeAct = anneeAct;
		this.moisAct = moisAct;

	}

	/**
	 * Retourne l'annee d'entree de l'Employe.
	 * @return annee d'entree de l'Employe,sous forme d'un.
	 * @see anneeEntree.
	 */
	public final int getAnneeEntree() {
		return this.anneeEntree;
	}

	/**
	 * Retourne le nom de l'Employe.
	 * @return Le nom de l'Employe ,sous forme d'un String.
	 * @see nom
	 */
	public final String getNom() {
		return this.nom;
	}

	/**
	 * Retourne le prenom de l'Employe.
	 * @return Le prenom de l'Employe ,sous forme d'un String.
	 * @see prenom
	 */
	public final String getPrenom() {
		return this.prenom;
	}

	/**
	 * Retourne l'age de l'Employe.
	 * @return l'age de l'Employe ,sous forme d'un int.
	 * @see age:age de lemploye
	 */
	public final int getAge() {
		return this.age;
	}

	/**
	 * affecter la valeur nom au nom de l'Employe.
	 * @param nom : un variable de l'Employe ,sous forme
	 * d'un String qu'est le nom de l'employe.
	 * @see nom :nom de l'employe
	 */
	public final void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * affecter la valeur prenom au prenom de l'Employe.
	 * @param prenom :une variable de l'Employe ,sous forme d'un String.
	 * @see prenom ; prenom de l'employe.
	 */
	public final void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	 * affecte age à l'age de l'Employe.
	 * @param age : l'age de l'Employe de l'Employe ,sous forme d'un int.
	 * @see age : l'age de l'employe.
	 */
	public final void setAge(final int age) {
		this.age = age;
	}

	/**
	 * Retourne le salaire du l'Employe.
	 * @return le salaire de l'Employe ,sous forme d'un entier .
	 * @see salaire
	 */
	public final int getSalaire() {
		return this.salaire;
	}
	/**
	 * Cette fonction nous permet de calculer l'ancientee de l'employe
	 * par rapport a l'année d'entrée et l'année actuelle.
	 * @return returen un entier qu'est l'ancientee de l'employe.
	 **/
	private  final int calculAnnee() {

		if ((((this.moisAct - this.moisEntree) == 0)
				|| ((this.moisAct - this.moisEntree) > 0))
				& (this.anneeAct > this.anneeEntree)) {
			return this.anneeAct - this.anneeEntree;

		} else {
			return 0;
		}
	}
	/**
	 * Elle calccule le salaire de l'employe de cette maniere :
	 * son salaire fixe
	 * plus (20 * le nombre d'année d'ancientée).
	 * @return returen le salaire de l'employe.
	 * */
	public  int calculeSlaire() {
		final int prime = 20;
		return this.salaire + (prime * this.calculAnnee());

	}

}
