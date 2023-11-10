
import entities.Role;
import entities.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class RoleAssignmentService {
    @PersistenceContext
    private EntityManager entityManager;

    public void assignRoleToUser(User user, Role role) {
        user.setRole(role);
        entityManager.merge(user);
    }
}