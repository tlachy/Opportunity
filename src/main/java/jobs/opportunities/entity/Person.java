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

import jobs.opportunities.entity.common.Gender;
import jobs.opportunities.entity.common.Nationality;
import jobs.opportunities.entity.common.Religion;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToMany(mappedBy="person", orphanRemoval=true)
	Set<SpokenLanguage> spokenLanguage = new HashSet<SpokenLanguage>();

	@OneToOne(mappedBy="person", orphanRemoval=true)
	private FirstName firstName;

	private String middleNames;

	private String lastName;

	private LocalDate dateOfBorn;

	private Nationality nationality;

	private Gender gender;

	@Transient
	private List<String> locationOfHome; // if company sets misto vykonu prace this can be used for calculationg distance

	private Religion religion;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<SpokenLanguage> getSpokenLanguage() {
		return spokenLanguage;
	}

	public void setSpokenLanguage(Set<SpokenLanguage> spokenLanguage) {
		this.spokenLanguage = spokenLanguage;
	}

	public FirstName getFirstName() {
		return firstName;
	}

	public void setFirstName(FirstName firstName) {
		this.firstName = firstName;
	}

	public String getMiddleNames() {
		return middleNames;
	}

	public void setMiddleNames(String middleNames) {
		this.middleNames = middleNames;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBorn() {
		return dateOfBorn;
	}

	public void setDateOfBorn(LocalDate dateOfBorn) {
		this.dateOfBorn = dateOfBorn;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<String> getLocationOfHome() {
		return locationOfHome;
	}

	public void setLocationOfHome(List<String> locationOfHome) {
		this.locationOfHome = locationOfHome;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}
}

