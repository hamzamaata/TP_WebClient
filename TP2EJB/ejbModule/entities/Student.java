package entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students")
public class Student implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    // Relation avec l'utilisateur (OneToOne)
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Relation avec la filière (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "filiere_id")
    private Filiere filiere;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setId(Long studentId) {
		// TODO Auto-generated method stub
		
	}

    // Getters et Setters
    // ...
}