package data;

public class Administrateur {
	
	String mail, mdp, nom, prenom;
	int id;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Administrateur(String mail, String mdp, String nom, String prenom, int id) {
		super();
		this.mail = mail;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

}
