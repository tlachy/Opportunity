package jobs.opportunities;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.stereotype.Service;

import jobs.opportunities.entity.FirstName;
import jobs.opportunities.entity.Language;
import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.SpokenLanguage;
import jobs.opportunities.entity.common.LanguageLevel;
import jobs.opportunities.repository.FirstNameRepository;
import jobs.opportunities.repository.LanguageRepository;
import jobs.opportunities.repository.PersonRepository;
import jobs.opportunities.repository.SpokenLanguageRepository;

@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@ComponentScan(excludeFilters = @ComponentScan.Filter({ Service.class, Configuration.class }))  //with no default packages set scans from this package higher
public class Application extends RepositoryRestMvcConfiguration {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	LanguageRepository languageRepository;

	@Autowired
	SpokenLanguageRepository spokenLanguageRepository;

	@Autowired
	FirstNameRepository firstNameRepository;

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(SpokenLanguage.class, Language.class, Person.class, FirstName.class);
		config.setReturnBodyOnCreate(true);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	private void load() {

		Person person1 = new Person();
		person1.setLastName("Nudle");
		Person person = personRepository.save(person1);

		FirstName firstName = new FirstName();
		firstName.setValue("Petr");
		firstName.setPerson(person);
		firstNameRepository.save(firstName);



		Language en = new Language();
		en.setId1("eng");
		en.setId2("en");
		en.setId3("eng");
		en.setNativ("English");
		en.setEng("English");
		en.setFra("anglais");
		en.setSpa("inglés");
		en.setZho("英语");
		en.setRus("английский");
		en.setDeu("Englisch");
		en.setIcon("");

	    en = languageRepository.save(en);

		Language deu = new Language();
		deu.setId1("deu");
		deu.setId2("de");
		deu.setId3("ger");
		deu.setNativ("Deutsch");
		deu.setEng("German");
		deu.setFra("allemand");
		deu.setSpa("alemán");
		deu.setZho("德语");
		deu.setRus("немецкий");
		deu.setDeu("Deutsch");
		deu.setIcon("");

		deu = languageRepository.save(deu);

		SpokenLanguage speaksEn = new SpokenLanguage();
		speaksEn.setLanguageLevel(LanguageLevel.A1);
		speaksEn.setLanguage(en);
		speaksEn.setPerson(person);

		SpokenLanguage speaksDe = new SpokenLanguage();
		speaksDe.setPerson(person);
		speaksDe.setLanguage(deu);
		speaksDe.setLanguageLevel(LanguageLevel.NATIVE);

		spokenLanguageRepository.save(speaksEn);
		spokenLanguageRepository.save(speaksDe);
	}
}
