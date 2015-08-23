package jobs.opportunities.entity;

import jobs.opportunities.entity.abstractentity.IdEntity;
import jobs.opportunities.entity.common.EducationType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class EducationInstitution extends IdEntity {

	@OneToOne
	private Address address;

	private String name;

	private String url;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

