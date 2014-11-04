package jobs.opportunities.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jobs.opportunities.entity.common.LanguageLevel;
import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

@Entity
//@Table(uniqueConstraints=@UniqueConstraint(columnNames={"person", "language"}))
public class SpokenLanguage implements Searchable, Visible {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private Person person;

	@ManyToOne
	private Language language;

	@NotNull
	@Column(nullable = false)
	private LanguageLevel languageLevel;

	@NotNull
	@Column(nullable = false)
	private Searchability searchability = Searchability.SEARCHABLE;

	@NotNull
	@Column(nullable = false)
	private Visibility visibility = Visibility.PUBLICLY_VISIBLE;




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

	public Searchability getSearchability() {
		return searchability;
	}

	public void setSearchability(Searchability searchability) {
		this.searchability = searchability;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}
}


