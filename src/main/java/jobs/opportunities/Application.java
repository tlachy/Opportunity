package jobs.opportunities;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
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
import jobs.opportunities.entity.JobPosition;
import jobs.opportunities.entity.JobSearch;
import jobs.opportunities.entity.Language;
import jobs.opportunities.entity.LastName;
import jobs.opportunities.entity.MiddleNames;
import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.SearchCondition;
import jobs.opportunities.entity.SpokenLanguage;
import jobs.opportunities.entity.common.JobSearchType;
import jobs.opportunities.entity.common.LanguageLevel;
import jobs.opportunities.entity.common.PositionType;
import jobs.opportunities.entity.common.SearchConditionType;
import jobs.opportunities.repository.FirstNameRepository;
import jobs.opportunities.repository.JobPositionRepository;
import jobs.opportunities.repository.JobSearchRepository;
import jobs.opportunities.repository.LanguageRepository;
import jobs.opportunities.repository.LastNameRepository;
import jobs.opportunities.repository.MiddleNamesRepository;
import jobs.opportunities.repository.PersonRepository;
import jobs.opportunities.repository.SearchConditionRepository;
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

	@Autowired
	LastNameRepository lastNameRepository;

	@Autowired
	MiddleNamesRepository middleNamesRepository;

	@Autowired
	JobPositionRepository jobPositionRepository;

	@Autowired
	JobSearchRepository jobSearchRepository;

	@Autowired
	SearchConditionRepository searchConditionRepository;




	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(SpokenLanguage.class, Language.class, Person.class, FirstName.class, JobPosition.class);
		config.setReturnBodyOnCreate(true);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	private void load() {

		Person person1 = new Person();
		person1.setDateOfBorn(LocalDate.of(1948, Month.NOVEMBER, 20));
		Person person = personRepository.save(person1);

		FirstName firstName = new FirstName();
		firstName.setValue("George");
		firstName.setPerson(person);
		firstNameRepository.save(firstName);

		LastName lastName = new LastName();
		lastName.setValue("Martin");
		lastName.setPerson(person);
		lastNameRepository.save(lastName);

		MiddleNames middleNames = new MiddleNames();
		middleNames.setValue("Raymond Richard");
		middleNames.setPerson(person);
		middleNamesRepository.save(middleNames);

		JobPosition jobPosition = new JobPosition();
		jobPosition.setPerson(person);
		jobPosition.setCompany("IBA CZ");
		jobPosition.setProject("Human resources management and aplicant management system");
		jobPosition.setPosition("Java Developer");
		jobPosition.setDesc("Doc Hastings, protects and promotes hydropower resources by ending practices that diminish existing hydropower, cutting regulatory red-tape, generating new non-federal funding for new projects and improving transparency. Hydropower is a clean, renewable form of energy that accounts for 70 percent of electricity in Washington state, seven percent of electricity generated in the U.S. and prevents 200 million annual metric tons of carbon emissions.");
		jobPosition.setTechnologies("HTML/CSS, Javascript, jQuery, Flash, Python, Ruby, ASP.NET, Wordpress, Drupal, Joomla");

		jobPosition.setFromMonth("6");
		jobPosition.setFromYear("1998");

		jobPosition.setToMonth("11");
		jobPosition.setToYear("1999");

		jobPosition.setPositionType(PositionType.Regular);
		jobPosition.setWorkingLanguage("eng");
		
		jobPositionRepository.save(jobPosition);


		JobPosition jobPosition1 = new JobPosition();
		jobPosition1.setPerson(person);
		jobPosition1.setCompany("IBA CZ");
		jobPosition1.setPosition("Java Developer");
		jobPosition1.setProject("Aplicant management system");
		jobPosition1.setDesc("Hydropower is a clean, renewable form of energy that accounts for 70 percent of electricity in Washington state, seven percent of electricity generated in the U.S. and prevents 200 million annual metric tons of carbon emissions");
		jobPosition1.setTechnologies("PHP, Nette, Flash, Python, Ruby, ASP.NET, Wordpress, Drupal, Joomla");

		jobPosition1.setFromMonth("6");
		jobPosition1.setFromYear("1999");

		jobPosition1.setToMonth("11");
		jobPosition1.setToYear("2003");

		jobPosition1.setPositionType(PositionType.Manager);
		jobPosition1.setWorkingLanguage("deu");

		jobPositionRepository.save(jobPosition1);


		JobPosition jobPosition2 = new JobPosition();
		jobPosition2.setPerson(person);
		jobPosition2.setCompany("IHolding s.r.o.");
		jobPosition2.setPosition("HTML Coder");
		jobPosition2.setProject("Company website");
		jobPosition2.setDesc("Washington state, seven percent of electricity generated in the U.S. and prevents 200 million annual metric tons of carbon emissions");
		jobPosition2.setTechnologies("HTML/CSS, Javascript, jQuery");

		jobPosition2.setFromMonth("6");
		jobPosition2.setFromYear("2004");

		jobPosition2.setToMonth("3");
		jobPosition2.setToYear("2012");

		jobPosition2.setPositionType(PositionType.Executive);
		jobPosition2.setWorkingLanguage("deu");

		jobPositionRepository.save(jobPosition2);


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

		JobSearch jobSearch = new JobSearch();
		jobSearch.setJobSearchType(JobSearchType.USER_SEARCH);
		jobSearch.setPerson(person);
		jobSearch.setCreated(new Date());
		jobSearch.setLastRun(new Date());

		jobSearchRepository.save(jobSearch);


		SearchCondition searchCondition = new SearchCondition();
		searchCondition.setX(0);
		searchCondition.setY(0);
		searchCondition.setIntValue1(1);
		searchCondition.setStringValue1("JAVA");
		searchCondition.setSearchConditionType(SearchConditionType.SKILL);
		searchCondition.setJobSearch(jobSearch);

		searchConditionRepository.save(searchCondition);

		SearchCondition searchCondition1 = new SearchCondition();
		searchCondition1.setX(1);
		searchCondition1.setY(0);
		searchCondition1.setIntValue1(22);
		searchCondition1.setIntValue1(60);
		searchCondition1.setSearchConditionType(SearchConditionType.AGE);
		searchCondition1.setJobSearch(jobSearch);

		searchConditionRepository.save(searchCondition1);

		SearchCondition searchCondition2 = new SearchCondition();
		searchCondition2.setX(0);
		searchCondition2.setY(1);
		searchCondition2.setIntValue1(0); //value in monhts
		searchCondition2.setSearchConditionType(SearchConditionType.AVAILABILITY);
		searchCondition2.setJobSearch(jobSearch);

		searchConditionRepository.save(searchCondition2);

	}
}
