import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.naming.InitialContext;

import org.junit.Test;

import entities.Filiere;
import service.FiliereService;

public class TestFiliere {

    private static FiliereService filiereService;

    @BeforeClass
    public static void setUp() {
        try {
            // Initialisation du contexte JNDI pour acc�der aux EJB
            InitialContext context = new InitialContext();

            // Recherche du service FiliereService via JNDI
            filiereService = (FiliereService) context.lookup("java:global/votre-projet/FiliereService!com.monprojet.service.FiliereService");

            // Fermeture du contexte
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors de l'initialisation des tests.");
        }
    }

    private static void fail(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testGetAllFilieres() {
        try {
            // Appel de la m�thode sur le serveur
            List<Filiere> filieres = filiereService.getAllFilieres();

            // V�rification du r�sultat
            assertNotNull(filieres);
            assertFalse(filieres.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors du testGetAllFilieres.");
        }
    }

    // Ajoutez d'autres m�thodes de test en fonction des besoins

}
