package dao;

import data.Commercant;
import data.Panier;

public interface IUtilisateurDAO {

	public Commercant findByName(String r);
	public void r�server(Panier p);

}
