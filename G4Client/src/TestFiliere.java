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
            // Initialisation du contexte JNDI pour accéder aux EJB
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
            // Appel de la méthode sur le serveur
            List<Filiere> filieres = filiereService.getAllFilieres();

            // Vérification du résultat
            assertNotNull(filieres);
            assertFalse(filieres.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors du testGetAllFilieres.");
        }
    }

    // Ajoutez d'autres méthodes de test en fonction des besoins

}
