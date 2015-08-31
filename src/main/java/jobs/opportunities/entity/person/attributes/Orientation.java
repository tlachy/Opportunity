package jobs.opportunities.entity.person.attributes;

import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.abstractentity.ValueEntity;

import javax.persistence.OneToOne;

@javax.persistence.Entity
public class Orientation extends ValueEntity<Orientation.OrientationEnum> {

	public static enum OrientationEnum {
		HOMOSEXUAL, HETEROSEXUAL
	}

	@OneToOne
	private Person person;

	/*@Enumerated(EnumType.STRING)
	private OrientationEnum value;*/

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/*public OrientationEnum getValue() {
		return value;
	}

	public void setValue(OrientationEnum value) {
		this.value = value;
	}*/

}
