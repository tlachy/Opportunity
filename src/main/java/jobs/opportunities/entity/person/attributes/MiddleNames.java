package jobs.opportunities.entity.person.attributes;

import javax.persistence.OneToOne;

import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.abstractentity.ValueEntity;

@javax.persistence.Entity
public class MiddleNames extends ValueEntity<String> {

	@OneToOne
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
