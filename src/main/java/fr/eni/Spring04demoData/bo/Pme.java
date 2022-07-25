package fr.eni.Spring04demoData.bo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("PME")
public class Pme extends Entreprise {
	private Integer chiffreAffaire;
}
