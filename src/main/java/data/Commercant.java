package data;

public class Commercant {
	
	String etablissement, catégorie, ville;
	int id;
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Commercant(String etablissement, String catégorie, String ville, int id) {
		super();
		this.etablissement = etablissement;
		this.catégorie = catégorie;
		this.ville = ville;
		this.id = id;
	}
	

}
