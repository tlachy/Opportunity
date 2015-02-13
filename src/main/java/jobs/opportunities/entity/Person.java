package jobs.opportunities.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import jobs.opportunities.entity.person.attributes.Religion;
import jobs.opportunities.entity.person.attributes.*;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private FirstName firstName;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private LastName lastName;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private MiddleNames middleNames;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private DateOfBirth dateOfBirth;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private Gender gender;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private Nationality nationality;

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private Religion religion;



	@OneToMany(mappedBy="person", orphanRemoval=true)
	private Set<JobPosition> jobPosition = new HashSet<JobPosition>();

	@OneToMany(mappedBy="person", orphanRemoval=true)
	private Set<SpokenLanguage> spokenLanguage = new HashSet<SpokenLanguage>();

	@OneToMany(mappedBy="person", orphanRemoval=true)
	private Set<JobSearch> jobSearch = new HashSet<JobSearch>();

	@Transient
	private List<String> locationOfHome; // if company sets misto vykonu prace this can be used for calculationg distance

	//<editor-fold desc="Getters&Setters">

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public FirstName getFirstName() {
		return firstName;
	}

	public void setFirstName(FirstName firstName) {
		this.firstName = firstName;
	}

	public LastName getLastName() {
		return lastName;
	}

	public void setLastName(LastName lastName) {
		this.lastName = lastName;
	}

	public MiddleNames getMiddleNames() {
		return middleNames;
	}

	public void setMiddleNames(MiddleNames middleNames) {
		this.middleNames = middleNames;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public Set<JobPosition> getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(Set<JobPosition> jobPosition) {
		this.jobPosition = jobPosition;
	}

	public Set<SpokenLanguage> getSpokenLanguage() {
		return spokenLanguage;
	}

	public void setSpokenLanguage(Set<SpokenLanguage> spokenLanguage) {
		this.spokenLanguage = spokenLanguage;
	}

	public Set<JobSearch> getJobSearch() {
		return jobSearch;
	}

	public void setJobSearch(Set<JobSearch> jobSearch) {
		this.jobSearch = jobSearch;
	}

	public List<String> getLocationOfHome() {
		return locationOfHome;
	}

	public void setLocationOfHome(List<String> locationOfHome) {
		this.locationOfHome = locationOfHome;
	}


	//</editor-fold>
}

