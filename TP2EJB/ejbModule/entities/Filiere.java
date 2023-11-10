package entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "filieres")
public class Filiere implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    // Relation avec les étudiants (OneToMany)
    @OneToMany(mappedBy = "filiere", cascade = CascadeType.ALL)
    private List<Student> students;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long filiereId) {
		// TODO Auto-generated method stub
		
	}

    // Getters et Setters
    // ...
}