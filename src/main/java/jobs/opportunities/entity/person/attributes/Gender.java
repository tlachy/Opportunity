package jobs.opportunities.entity.person.attributes;

import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.abstractentity.SearchableVisibleEntity;
import jobs.opportunities.entity.abstractentity.ValueEntity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@javax.persistence.Entity
public class Gender extends ValueEntity<Gender.GenderEnum> {

	public static enum GenderEnum {
		Male, Female, Transexual  //TODO doplnit
	}

	@OneToOne
	private Person person;

/*
	@Enumerated(EnumType.STRING)
	private GenderEnum value;
*/

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
