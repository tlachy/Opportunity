package jobs.opportunities.entity;

import java.time.LocalDate;

import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

public class JobPosition implements Searchable, Visible {

	private String company;
	private LocalDate from;
	private LocalDate to;
	private int timeOnPositionInMonth;
	private String position;
	private String project;
	private String positionType;

	private Language workingLanguage;

	private String desc;
	private String technologies;
	private Searchability searchability;
	private Visibility visibility;


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
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

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public Language getWorkingLanguage() {
		return workingLanguage;
	}

	public void setWorkingLanguage(Language workingLanguage) {
		this.workingLanguage = workingLanguage;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public Searchability getSearchability() {
		return searchability;
	}

	public void setSearchability(Searchability searchability) {
		this.searchability = searchability;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}
}
