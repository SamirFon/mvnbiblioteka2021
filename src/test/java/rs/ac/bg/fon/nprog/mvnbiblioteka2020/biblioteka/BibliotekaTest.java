package rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import rs.ac.bg.fon.nprog.mvnbiblioteka2020.biblioteka.interfejs.BibliotekaInterfejsTest;


public class BibliotekaTest extends BibliotekaInterfejsTest {
	
	

	@BeforeEach
	public void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}

	@AfterEach
	public	void tearDown() throws Exception {
		biblioteka  = null;
	}

	

}
