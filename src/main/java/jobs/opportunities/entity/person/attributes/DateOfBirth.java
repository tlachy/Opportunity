package jobs.opportunities.entity.person.attributes;

import javax.persistence.OneToOne;

import jobs.opportunities.entity.abstractentity.SearchableVisibleEntity;
import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.abstractentity.ValueEntity;

import java.util.Date;

@javax.persistence.Entity
public class DateOfBirth extends ValueEntity<Date> {

	@OneToOne
	private Person person;

	//private Date value;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

//	// TODO - LocalDate? - neni native podpora v jpa
//	public Date getValue() {
//		return value;
//	}
//
//	public void setValue(Date value) {
//		this.value = value;
//	}

}