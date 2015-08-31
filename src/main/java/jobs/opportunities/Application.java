package jobs.opportunities;

import java.util.Date;
import javax.annotation.PostConstruct;

import jobs.opportunities.entity.*;
import jobs.opportunities.entity.common.*;
import jobs.opportunities.entity.person.attributes.*;
import jobs.opportunities.repository.*;
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

@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@ComponentScan(excludeFilters = @ComponentScan.Filter({Service.class, Configuration.class}))
//with no default packages set scans from this package higher
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
	NationalityRepository nationalityRepository;

	@Autowired
	MiddleNamesRepository middleNamesRepository;

	@Autowired
	JobPositionRepository jobPositionRepository;

	@Autowired
	JobSearchRepository jobSearchRepository;

	@Autowired
	SearchConditionRepository searchConditionRepository;

	@Autowired
	ReligionRepository religionRepository;

	@Autowired
	ContactRepository contactRepository;

	@Autowired
	CompletedEducationRepository completedEducationRepository;

	@Autowired
	AddressRepository addressRepository;


	@Autowired
	EducationInstitutionRepository educationInstitutionRepository;

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(SpokenLanguage.class, Language.class, Person.class, FirstName.class, JobPosition.class, SearchCondition.class, JobSearch.class, MiddleNames.class, LastName.class);
		config.setReturnBodyOnCreate(true);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	private void load() {

		Person person = new Person();

		Contact contact = new Contact();
		contact.setEmail("trtko@makovy.sk");
		contact.setMobilePhone("777-777-777");
		contact.setSkype("dolesimazedol");
		contact.setPerson(person);
		person.setContact(contact);
		person = personRepository.save(person);

		Address address = new Address();
		address.setCity("Trnava");
		address.setStreet("Vrcharova");
		address.setNumber("14B");
		address.setZipCode("324324");
		address.setState("Slovensko");
		address = addressRepository.save(address);

		Address address2 = new Address();
		address2.setCity("Kosice");
		address2.setStreet("Banka");
		address2.setNumber("2");
		address2.setZipCode("111");
		address2.setState("Slovensko");
		address2 = addressRepository.save(address2);

		EducationInstitution institution = new EducationInstitution();
		institution.setAddress(address);
		institution.setName("Katolicka univerzita");
		institution.setUrl("http://kostol.sk");
		institution = educationInstitutionRepository.save(institution);

		EducationInstitution institution2 = new EducationInstitution();
		institution2.setAddress(address2);
		institution2.setName("Kosicka postihnuta");
		institution2.setUrl("http://dement.sk");
		institution2 = educationInstitutionRepository.save(institution2);

		CompletedEducation education = new CompletedEducation();
		education.setPerson(person);
		education.setEducationType(EducationType.UNIVERSITY);
		education.setInstitution(institution);
		completedEducationRepository.save(education);

		CompletedEducation education2 = new CompletedEducation();
		education2.setPerson(person);
		education2.setEducationType(EducationType.COLLEGE);
		education2.setInstitution(institution2);

		completedEducationRepository.save(education2);

		FirstName firstName = new FirstName();
		firstName.setValue("George");
		firstName.setPerson(person);
		firstNameRepository.save(firstName);

		LastName lastName = new LastName();
		lastName.setValue("Martin");
		lastName.setPerson(person);
		lastNameRepository.save(lastName);

		Nationality nationality = new Nationality();
		nationality.setValue(Nationality.NationalityEnum.ALBANIAN);
		nationality.setPerson(person);
		nationalityRepository.save(nationality);

		Religion religion = new Religion();
		religion.setValue(Religion.ReligionEnum.Catholicism);
		religion.setPerson(person);
		religionRepository.save(religion);

		MiddleNames middleNames = new MiddleNames();
		middleNames.setValue("Raymond Richard");
		middleNames.setPerson(person);
		middleNamesRepository.save(middleNames);

		JobPosition jobPosition = new JobPosition();
		jobPosition.setPerson(person);
		jobPosition.setCompany("IBA CZ");
		jobPosition.setProject("Human resources management and aplicant management system");
		jobPosition.setPosition("Java Developer");
		jobPosition.setDescription("Doc Hastings, protects and promotes hydropower resources by ending practices that diminish existing hydropower, cutting regulatory red-tape, generating new non-federal funding for new projects and improving transparency. Hydropower is a clean, renewable form of energy that accounts for 70 percent of electricity in Washington state, seven percent of electricity generated in the U.S. and prevents 200 million annual metric tons of carbon emissions.");
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
		jobPosition1.setDescription("Hydropower is a clean, renewable form of energy that accounts for 70 percent of electricity in Washington state, seven percent of electricity generated in the U.S. and prevents 200 million annual metric tons of carbon emissions");
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
		jobPosition2.setDescription("Washington state, seven percent of electricity generated in the U.S. and prevents 200 million annual metric tons of carbon emissions");
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
		speaksEn.setLanguageLevelType(LanguageLevelType.A1);
		speaksEn.setLanguage(en);
		speaksEn.setPerson(person);

		SpokenLanguage speaksDe = new SpokenLanguage();
		speaksDe.setPerson(person);
		speaksDe.setLanguage(deu);
		speaksDe.setLanguageLevelType(LanguageLevelType.NATIVE);

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


		JobSearch preferences = new JobSearch();
		preferences.setJobSearchType(JobSearchType.USER_PREFERENCES);
		preferences.setPerson(person);
		preferences.setCreated(new Date());
		preferences.setLastRun(new Date());

		jobSearchRepository.save(preferences);

		SearchCondition searchCondition3 = new SearchCondition();
		searchCondition3.setX(0);
		searchCondition3.setY(1);
		searchCondition3.setStringValue1("Java");
		searchCondition3.setJobSearch(preferences);

		searchConditionRepository.save(searchCondition3);

	}
}
