package service;

import java.util.List;

import entities.Role;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class RoleService {
    @PersistenceContext
    private EntityManager entityManager;

    public Role createRole(Role role) {
        entityManager.persist(role);
        return role;
    }

    public Role updateRole(Role role) {
        return entityManager.merge(role);
    }

    public void deleteRole(Long roleId) {
        Role role = entityManager.find(Role.class, roleId);
        if (role != null) {
            entityManager.remove(role);
        }
    }

	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}
}