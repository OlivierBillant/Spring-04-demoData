package fr.eni.Spring04demoData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;
import fr.eni.Spring04demoData.bo.Contact;
import fr.eni.Spring04demoData.dal.ContactDao;

@SpringBootApplication
public class Spring04DemoDataApplication implements CommandLineRunner {
	@Autowired
	private ContactDao dao;

	public static void main(String[] args) {
		SpringApplication.run(Spring04DemoDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Contact jean = new Contact("Cérien", "Jean", "060606060606" );
		dao.save(jean);
		System.out.println(jean);
		
		System.out.println("Test affichage db");
		dao.findAll().forEach(System.out::println);
	}

}
