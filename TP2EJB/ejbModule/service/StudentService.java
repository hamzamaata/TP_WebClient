package service;

import java.util.List;

import dao.IDao;
import dao.IDaoLocal;
import entities.Student;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Stateless
public class StudentService implements IDao<Student>, IDaoLocal<Student>{
    @PersistenceContext
    private EntityManager entityManager;

    public Student createStudent(Student student) {
        entityManager.persist(student);
        return student;
    }

    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }

    public void deleteStudent(Long studentId) {
        Student student = entityManager.find(Student.class, studentId);
        if (student != null) {
            entityManager.remove(student);
        }
    }

    public List<Student> getAllStudents() {
        TypedQuery<Student> query = entityManager.createQuery("SELECT s FROM Student s", Student.class);
        return query.getResultList();
    }

    public Student getStudentById(Long studentId) {
        return entityManager.find(Student.class, studentId);
    }

	@Override
	public Student create(Student o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student delete(Student o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
