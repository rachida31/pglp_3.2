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
public abstract class  Employe {
	/**
     * nom c'est le nom de l'employe.
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#getNom()
     */
	
	private String nom;
	/**
     * prenom c'est le prenom de l'employe.
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#Prenom()
     */
	
	private String prenom;
	/**
     * age c'est l'age de l'employe .
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#getAge()
     */
	
	private int  age;
	/**
     * salaire c'est le salaire initial de l'employer qui veut 1500$ .
     * 
     * @see Employe#getSalaire()
     */
	
	private int salaire;
	/**
     * anneeEntree c'est l'annee dans la quelle l'enploye a commencer a travailler .
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#getAnneeEntree()
     */
	
	private int anneeEntree;
	 /**
     * moisEntree c'est le mois dans la quelle l'enploye a commencer a travailler .
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#getMoisEntree()
     */
	private int moisEntree;
	 /**
     * anneeAct c'est l'annee actuelle .
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#getAnneeAct()
     */
	private int anneeAct;
	 /**
     * moisAct c'est le mois actuelle .
     * 
     * @see Employe#Employe(String,String,int,int,int,int,int)
     * @see Employe#getAnneeAct()
     */
	private int moisAct;
	

    /**
     * Constructeur Employe.
     * <p>
     * A la construction d'un objet Employe, le "salare" est fixé à 1500$, ce qui
     * correspond au salaire initial.
     * </p>
     * @param nom
     *            le nom de l'Employe.
     * @param prenom
     *            Le prenom de l'Employe.
     * @param age
     * 			  L'age de l'Employe.
     * @param anneeEntree
     * 			  L'annee d'entree de l'Employe pour travailler.
     * @param moisEntree 
     * 			  Le mois d'entree de l'Employe pour travailler.
     * 
     *   * @param anneeAct
     * 			  L'annee actuelle.
     * @param moisAct 
     * 			  Le mois actuelle.
     * 
     * @see Zero#nom
     * @see Zero#prenom
     * @see Zero#age
     *  @see Zero# salaire
     * @see Zero#anneeEntree
     * @see Zero#moisEntree
     * @see Zero#anneeAct
     * @see Zero#moisAct
     */
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
	 /**
     * Retourne l'annee d'entree de l'Employe.
     * 
     * @return annee d'entree de l'Employe,sous forme d'un.
     * 
     * @see anneeEntree.
     */
	public int getAnneeEntree()
	{
		return this.anneeEntree;
	}
	 /**
     * Retourne le nom de l'Employe.
     * 
     * @return Le nom de l'Employe ,sous forme d'un String.
     * 
     * @see nom
     */
	public String getNom()
	{
		return this.nom;
	}	
	 /**
     * Retourne le prenom de l'Employe.
     * 
     * @return Le prenom de l'Employe ,sous forme d'un String.
     * 
     * @see prenom
     */
	public String getPrenom()
	{
		return this.prenom;
	}	
	 /**
     * Retourne l'age de l'Employe.
     * 
     * @return l'age de l'Employe ,sous forme d'un int.
     * 
     * @see age
     */
	public int getAge()
	{
		return this.age;
	}	
	 /**
     *affecter la valeur nom au nom de l'Employe.
     * 
     *@param un variable de l'Employe ,sous forme d'un String. 
     * @see nom
     */
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	 /**
     *affecter la valeur prenom au prenom de l'Employe.
     * 
     *@param  une variable de l'Employe ,sous forme d'un String.
     * @see prenom
     */
	public void setPrenom(String prenom)
	{
		this.prenom=prenom;
	}
	 /**
     * affecte age à l'age de l'Employe.
     * 
     *@param l'age de l'Employe de l'Employe ,sous forme d'un int. 
     * @see age.
     */
	public void setAge(int age)
	{
		this.age=age;
	}
	 /**
     * Retourne le salaire du l'Employe.
     * 
     * @return le salaire  de l'Employe ,sous forme d'un entier .
     * 
     * @see salaire
     */
	public int getSalaire()
	{
		return this.salaire;
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
