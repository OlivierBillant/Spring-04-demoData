package fr.eni.Spring04demoData;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.eni.Spring04demoData.bo.Adresse;
import fr.eni.Spring04demoData.bo.Contact;
import fr.eni.Spring04demoData.dal.ContactDao;

@SpringBootApplication
public class Spring04DemoDataApplication implements CommandLineRunner {
	@Autowired
	private ContactDao dao;

	public static void main(String[] args) {
		SpringApplication.run(Spring04DemoDataApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		Contact jean = new Contact("Cérien", "Jean", "060606060606");
		Contact ferdinand = new Contact("SaintMaloALaNageCEestPasDuGateau", "Ferdinand", "090909090909");

		System.out.println(jean);

		Adresse adresse1 = new Adresse("Rue de Guilers", "Brest", "29200");
		Adresse adresse2 = new Adresse("Rue de Jean-Paul", "Brest", "29200");

		jean.getListeAdresse().add(adresse1);
		jean.getListeAdresse().add(adresse2);
		ferdinand.getListeAdresse().add(adresse1);

		dao.save(jean);
		dao.save(ferdinand);
		System.out.println("Test affichage db");
		dao.findAll().forEach(System.out::println);
		
		dao.getVilleFomrContact(jean).forEach(System.out::println);
	}

}
