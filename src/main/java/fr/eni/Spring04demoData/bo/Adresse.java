package fr.eni.Spring04demoData.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Adresse {
	@Id
	@GeneratedValue
	private Integer idAdresse;
	private String rue;
	private String ville;
	private String cp;

	@ManyToMany(mappedBy = "listeAdresse")
	private Set<Contact> listeContact = new HashSet<Contact>();

	public Adresse(String rue, String ville, String cp) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.cp = cp;
	}
	
	
}
