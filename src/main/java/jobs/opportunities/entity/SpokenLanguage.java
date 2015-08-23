package jobs.opportunities.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jobs.opportunities.entity.abstractentity.SearchableVisibleEntity;
import jobs.opportunities.entity.common.LanguageLevelType;

@Entity
//@Table(uniqueConstraints=@UniqueConstraint(columnNames={"person", "language"}))
public class SpokenLanguage extends SearchableVisibleEntity {

	@ManyToOne
	private Person person;

	@ManyToOne
	private Language language;

	@NotNull
	@Column(nullable = false)
	private LanguageLevelType languageLevelType;

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

	public LanguageLevelType getLanguageLevelType() {
		return languageLevelType;
	}

	public void setLanguageLevelType(LanguageLevelType languageLevelType) {
		this.languageLevelType = languageLevelType;
	}

}


