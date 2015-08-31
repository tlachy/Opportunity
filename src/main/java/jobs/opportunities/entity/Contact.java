package jobs.opportunities.entity;

import jobs.opportunities.entity.abstractentity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Contact extends IdEntity {

	@Column(length = 64)
	private String skype;

	@Column(name = "term", nullable = false, length = 64)
	private String email;

	@Column
	private String mobilePhone;

	@Column
	private String landPhone;

	@Column(length = 64)
	private String other;

	@OneToOne(mappedBy = "contact", orphanRemoval = true)
	private Person person;


	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getLandPhone() {
		return landPhone;
	}

	public void setLandPhone(String landPhone) {
		this.landPhone = landPhone;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
