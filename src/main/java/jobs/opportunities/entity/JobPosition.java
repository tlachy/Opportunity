package jobs.opportunities.entity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

import jobs.opportunities.entity.abstractentity.SearchableVisibleEntity;
import jobs.opportunities.entity.common.PositionType;

@javax.persistence.Entity
public class JobPosition extends SearchableVisibleEntity {

	@ManyToOne
	private Person person;

	private String company;

	private String fromMonth;
	private String fromYear;

	private String toMonth;
	private String toYear;

	private int timeOnPositionInMonth = 0;
	private String position;
	private String project;
	private PositionType positionType;

	private String workingLanguage;

	@Column(length = 2000)
	private String description;

	private String technologies;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFromMonth() {
		return fromMonth;
	}

	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}

	public String getFromYear() {
		return fromYear;
	}

	public void setFromYear(String fromYear) {
		this.fromYear = fromYear;
	}

	public String getToMonth() {
		return toMonth;
	}

	public void setToMonth(String toMonth) {
		this.toMonth = toMonth;
	}

	public String getToYear() {
		return toYear;
	}

	public void setToYear(String toYear) {
		this.toYear = toYear;
	}

	public int getTimeOnPositionInMonth() {
		return timeOnPositionInMonth;
	}

	public void setTimeOnPositionInMonth(int timeOnPositionInMonth) {
		this.timeOnPositionInMonth = timeOnPositionInMonth;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public PositionType getPositionType() {
		return positionType;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	public String getWorkingLanguage() {
		return workingLanguage;
	}

	public void setWorkingLanguage(String workingLanguage) {
		this.workingLanguage = workingLanguage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

}
