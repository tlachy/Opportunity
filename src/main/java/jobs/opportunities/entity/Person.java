package jobs.opportunities.entity;

import jobs.opportunities.entity.abstractentity.IdEntity;
import jobs.opportunities.entity.person.attributes.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Person extends IdEntity {

	@OneToOne(cascade= CascadeType.ALL)
	private Contact contact;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private FirstName firstName;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private LastName lastName;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private MiddleNames middleNames;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private DateOfBirth dateOfBirth;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Gender gender;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Nationality nationality;

	@OneToOne(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Religion religion;

	@OneToMany(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Set<JobPosition> jobPositions = new HashSet<JobPosition>();

	@OneToMany(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Set<SpokenLanguage> spokenLanguages = new HashSet<SpokenLanguage>();

	@OneToMany(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Set<JobSearch> jobSearches = new HashSet<JobSearch>();

	@OneToMany(mappedBy="person", orphanRemoval=true, cascade= CascadeType.ALL)
	private Set<CompletedEducation> completedEducations = new HashSet<CompletedEducation>();

	@Transient
	private List<String> locationOfHome; // if company sets misto vykonu prace this can be used for calculationg distance

	//<editor-fold desc="Getters&Setters">

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

	public Set<JobPosition> getJobPositions() {
		return jobPositions;
	}

	public void setJobPositions(Set<JobPosition> jobPositions) {
		this.jobPositions = jobPositions;
	}

	public Set<SpokenLanguage> getSpokenLanguages() {
		return spokenLanguages;
	}

	public void setSpokenLanguages(Set<SpokenLanguage> spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}

	public Set<JobSearch> getJobSearches() {
		return jobSearches;
	}

	public void setJobSearches(Set<JobSearch> jobSearches) {
		this.jobSearches = jobSearches;
	}

	public List<String> getLocationOfHome() {
		return locationOfHome;
	}

	public void setLocationOfHome(List<String> locationOfHome) {
		this.locationOfHome = locationOfHome;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Set<CompletedEducation> getCompletedEducations() {
		return completedEducations;
	}

	public void setCompletedEducations(Set<CompletedEducation> completedEducations) {
		this.completedEducations = completedEducations;
	}
}

