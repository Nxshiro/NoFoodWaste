package data;

public class Commercant {
	
	String etablissement, cat�gorie, ville;
	int id;
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public String getCat�gorie() {
		return cat�gorie;
	}
	public void setCat�gorie(String cat�gorie) {
		this.cat�gorie = cat�gorie;
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
	public Commercant(String etablissement, String cat�gorie, String ville, int id) {
		super();
		this.etablissement = etablissement;
		this.cat�gorie = cat�gorie;
		this.ville = ville;
		this.id = id;
	}
	

}
