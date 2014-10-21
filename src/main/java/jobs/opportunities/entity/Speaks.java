package jobs.opportunities.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//@Table(uniqueConstraints=@UniqueConstraint(columnNames={"person", "language"}))
public class Speaks {

	public static enum LanguageLevel{
		A1,A2,B1,B2,C1,C2,NATIVE
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private Person person;

	@ManyToOne
	private Language language;

	private LanguageLevel languageLevel;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public LanguageLevel getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(LanguageLevel languageLevel) {
		this.languageLevel = languageLevel;
	}
}


