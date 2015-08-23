package jobs.opportunities.entity.person.attributes;

import jobs.opportunities.entity.abstractentity.SearchableVisibleEntity;
import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.abstractentity.ValueEntity;

import javax.persistence.*;

@javax.persistence.Entity
public class Religion extends ValueEntity<Religion.ReligionEnum> {

	public static enum ReligionEnum {
		Islam, Mormonism, Buddhism, Catholicism, Hynduism, Protestantism, Restorationism, Judaism, Gnosticism, Newage, Pastafarianism, Scientology;   //find ISO norm - there is no such a thing
	}

	@OneToOne
	private Person person;

	/*@Enumerated(EnumType.STRING)
	private ReligionEnum value;
*/
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/*public ReligionEnum getValue() {
		return value;
	}

	public void setValue(ReligionEnum value) {
		this.value = value;
	}*/

}
