package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.interfejs;

import java.util.LinkedList;

import rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.Knjiga;

/**
 * 
 * interfejs koji predstavlja biblioteku
 * 
 * 
 * @author Korisnik
 *
 */


public interface BibliotekaInterfejs {

	/**
	 * dodaje novu knjigu u biblioteku
	 * 
	 * @param knjiga  Knjiga koja se dodaje
	 * 
	 * @throws java.lang.NullPointerException ako je u neta knjiga null
	 * 
	 * @throws java.lang.RuntimeException ako je uneta knjiga vec postoji u biblioteci (duplikat)
	 */
	public void dodajKnjigu (Knjiga knjiga);
	public void obrisiKnjigu (Knjiga knjiga);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu (Autor autor, String isbn, String naslov, String izdavac);
}
