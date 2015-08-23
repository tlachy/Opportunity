package jobs.opportunities.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import jobs.opportunities.entity.abstractentity.IdEntity;
import jobs.opportunities.entity.common.JobSearchType;

@Entity
public class JobSearch extends IdEntity {

	private Date created;

	private Date lastRun;

	private JobSearchType jobSearchType = JobSearchType.USER_SEARCH;

	@ManyToOne
	private Person person;

	@OneToMany(mappedBy="jobSearch")
	@OrderBy("y ASC, x ASC")
	Set<SearchCondition> searchCondition = new HashSet<SearchCondition>();

	//private Set<Interview> matches = new HashSet<Interview>();

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastRun() {
		return lastRun;
	}

	public void setLastRun(Date lastRun) {
		this.lastRun = lastRun;
	}

	public JobSearchType getJobSearchType() {
		return jobSearchType;
	}

	public void setJobSearchType(JobSearchType jobSearchType) {
		this.jobSearchType = jobSearchType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<SearchCondition> getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(Set<SearchCondition> searchCondition) {
		this.searchCondition = searchCondition;
	}
}
