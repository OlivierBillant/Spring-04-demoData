package fr.eni.Spring04demoData.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	private String nom;
	private String prenom;
	private String tel;
}
