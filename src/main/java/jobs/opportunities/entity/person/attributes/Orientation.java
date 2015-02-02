package jobs.opportunities.entity.person.attributes;

import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

import javax.persistence.*;

@Entity
public class Orientation {

	public static enum OrientationEnum {
		GAY, HETEROSEXUAL
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	private Person person;

	@Enumerated(EnumType.STRING)
	private OrientationEnum value;

	private Visible.Visibility visibility = Visible.Visibility.PUBLICLY_VISIBLE;

	private Searchable.Searchability searchability = Searchable.Searchability.SEARCHABLE;

	//<editor-fold desc="Getters&Setters" >
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

	public OrientationEnum getValue() {
		return value;
	}

	public void setValue(OrientationEnum value) {
		this.value = value;
	}

	public Visible.Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visible.Visibility visibility) {
		this.visibility = visibility;
	}

	public Searchable.Searchability getSearchability() {
		return searchability;
	}

	public void setSearchability(Searchable.Searchability searchability) {
		this.searchability = searchability;
	}
	//</editor-fold>
}
