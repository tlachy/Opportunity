package jobs.opportunities.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

@Entity
public class DateOfBirth implements Visible, Searchable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	private Person person;

	private String value;

	private Visibility visibility = Visibility.PUBLICLY_VISIBLE;

	private Searchability searchability = Searchability.SEARCHABLE;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public Searchability getSearchability() {
		return searchability;
	}

	public void setSearchability(Searchability searchability) {
		this.searchability = searchability;
	}
}