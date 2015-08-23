package jobs.opportunities.entity;


import jobs.opportunities.entity.abstractentity.IdEntity;
import jobs.opportunities.entity.common.EducationType;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
// TODO porusena norma, educationType zavysla na EducationInstitution...
public class CompletedEducation extends IdEntity {

	private EducationType educationType;

	@ManyToOne
	private Person person;

	@ManyToOne
	private EducationInstitution institution;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public EducationType getEducationType() {
		return educationType;
	}

	public void setEducationType(EducationType educationType) {
		this.educationType = educationType;
	}


	public EducationInstitution getInstitution() {
		return institution;
	}

	public void setInstitution(EducationInstitution institution) {
		this.institution = institution;
	}
}


