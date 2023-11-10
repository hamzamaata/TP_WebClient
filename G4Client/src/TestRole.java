

import org.junit.BeforeClass;
import org.junit.Test;

import entities.Role;
import service.RoleService;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.List;

import static org.junit.Assert.*;

public class TestRole {

    private static RoleService roleService;

    @BeforeClass
    public static void setUp() {
        try {
            // Initialisation du contexte JNDI pour acc�der aux EJB
            Context context = new InitialContext();

            // Recherche du service RoleService via JNDI
            roleService = (RoleService) context.lookup("java:global/votre-projet/RoleService!com.monprojet.service.RoleService");

            // Fermeture du contexte
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors de l'initialisation des tests.");
        }
    }

    @Test
    public void testGetAllRoles() {
        try {
            // Appel de la m�thode sur le serveur
            List<Role> roles = roleService.getAllRoles();

            // V�rification du r�sultat
            assertNotNull(roles);
            assertFalse(roles.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors du testGetAllRoles.");
        }
    }

    // Ajoutez d'autres m�thodes de test en fonction des besoins

}