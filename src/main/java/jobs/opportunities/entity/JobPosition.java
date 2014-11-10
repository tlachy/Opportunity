package jobs.opportunities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jobs.opportunities.entity.common.PositionType;
import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

@Entity
public class JobPosition implements Searchable, Visible {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

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
	private String desc;


	private String technologies;
	private Searchability searchability = Searchability.SEARCHABLE;
	private Visibility visibility = Visibility.PUBLICLY_VISIBLE;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
