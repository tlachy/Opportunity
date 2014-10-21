package jobs.opportunities;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.stereotype.Service;

import jobs.opportunities.entity.Language;
import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.Speaks;
import jobs.opportunities.repository.LanguageRepository;
import jobs.opportunities.repository.PersonRepository;
import jobs.opportunities.repository.SpeaksRepository;

@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@ComponentScan(excludeFilters = @ComponentScan.Filter({ Service.class, Configuration.class }))  //with no default packages set scans from this package higher
public class Application {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	LanguageRepository languageRepository;

	@Autowired
	SpeaksRepository speaksRepository;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	private void load() {

		Person person1 = new Person();
		person1.setFirstName("Petr");
		person1.setLastName("Nudle");

		Person person = personRepository.save(person1);


		Language en = new Language();
		en.setId1("eng");
		en.setId2("en");
		en.setId3("eng");
		en.setNativ("English");
		en.setEng("eng");
		en.setFra("anglais");
		en.setSpa("inglés");
		en.setZho("英语");
		en.setRus("английский");
		en.setDeu("Englisch");
		en.setIcon("");

	    Language language = languageRepository.save(en);

		Speaks speaks = new Speaks();
		speaks.setLanguageLevel(Speaks.LanguageLevel.A1);
		speaks.setLanguage(language);
		speaks.setPerson(person);

		Speaks speaks1 = speaksRepository.save(speaks);


	}
}
