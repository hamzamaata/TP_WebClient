

import org.junit.BeforeClass;
import org.junit.Test;

import entities.Student;
import service.StudentService;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.List;

import static org.junit.Assert.*;

public class TestSdudent {

    private static StudentService studentService;

    @BeforeClass
    public static void setUp() {
        try {
            // Initialisation du contexte JNDI pour acc�der aux EJB
            Context context = new InitialContext();

            // Recherche du service StudentService via JNDI
            studentService = (StudentService) context.lookup("java:global/votre-projet/StudentService!com.monprojet.service.StudentService");

            // Fermeture du contexte
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors de l'initialisation des tests.");
        }
    }

    @Test
    public void testGetAllStudents() {
        try {
            // Appel de la m�thode sur le serveur
            List<Student> students = studentService.getAllStudents();

            // V�rification du r�sultat
            assertNotNull(students);
            assertFalse(students.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Erreur lors du testGetAllStudents.");
        }
    }

    // Ajoutez d'autres m�thodes de test en fonction des besoins

}