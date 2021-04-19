package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.interfejs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.Knjiga;

 public abstract class BibliotekaInterfejsTest {
	 	
	 protected BibliotekaInterfejs  biblioteka;
		
		
	 
	@Test
	public	void testDodajKnjigu() {

		Knjiga k = new Knjiga();
		k.setNaslov("knjiga1");
				biblioteka.dodajKnjigu(k);
				assertEquals(1, biblioteka.vratiSveKnjige().size());
				assertEquals(k, biblioteka.vratiSveKnjige().get(0));
	}
	
	 
		@Test
		public	void testDodajKnjiguNull() {
			

			
					assertThrows(java.lang.NullPointerException.class, ()->biblioteka.dodajKnjigu(null));
		}
		@Test
		public		void testDodajKnjiguDuplikat() {
			
		Knjiga k = new Knjiga();
		k.setIsbn("12345");
		
		Knjiga k2 = new Knjiga();
		k2.setIsbn("12345");
		
				biblioteka.dodajKnjigu(k);
		//		biblioteka.dodajKnjigu(k2);

		RuntimeException e = assertThrows(java.lang.RuntimeException.class,()-> biblioteka.dodajKnjigu(k2));
		assertEquals("Knjiga vec postoji", e.getMessage());
		
		}	
		
	@Test
	public	void testObrisiKnjigu() {
		Knjiga k = new Knjiga();
		biblioteka.dodajKnjigu(k);
		biblioteka.obrisiKnjigu(k);
		
		assertEquals(0, biblioteka.vratiSveKnjige().size());
	}
	
	@Test
	public	void testObrisiKnjiguNull() {
		
		
		assertThrows(java.lang.RuntimeException.class,()-> biblioteka.obrisiKnjigu(null));
	}
	
	@Test
	public	void testObrisiKnjiguNePostoji() {
	
		Knjiga k = new Knjiga();
		k.setIsbn("12345");
		biblioteka.dodajKnjigu(k);
		
		Knjiga k1 = new Knjiga();
		k1.setIsbn("45678");
	
		
		
		assertThrows(java.lang.RuntimeException.class, ()->biblioteka.obrisiKnjigu(k1));
	}

	@Test
	public	void testVratiSveKnjige() {
		Knjiga k = new Knjiga();
		k.setIsbn("12345");
		
		biblioteka.dodajKnjigu(k);
		
		List<Knjiga> knjige = biblioteka.vratiSveKnjige();
		
		assertEquals(1, knjige.size());
		assertEquals(k, knjige.get(0));
	}

	@Test
	public	void testPronadjiKnjiguNull() {
		
		assertThrows(java.lang.RuntimeException.class, ()->biblioteka.pronadjiKnjigu(null, null, null, null));
		
		
	}
	
	@Test
	public	void testPronadjiKnjigu() {
		
		Knjiga k = new Knjiga();
		k.setIsbn("1234");
		k.setNaslov("Knjiga o dzungli");
		
		
		Knjiga k1 = new Knjiga();
		k1.setIsbn("4567");
		k1.setNaslov("Dzungla zivota");
		
		
		
		Knjiga k2 = new Knjiga();
		k2.setIsbn("7894");
		k2.setNaslov("Evgenije Onjegin");
		
		biblioteka.dodajKnjigu(k);
		biblioteka.dodajKnjigu(k2);
		biblioteka.dodajKnjigu(k1);

		List<Knjiga> rezultat = biblioteka.pronadjiKnjigu(null, null, "zung", null);
		
		assertEquals(2,rezultat.size());
		assertTrue(rezultat.contains(k));
		assertTrue(rezultat.contains(k1));
		
	}

}
