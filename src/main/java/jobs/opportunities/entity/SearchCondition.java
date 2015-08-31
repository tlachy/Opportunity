package jobs.opportunities.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jobs.opportunities.entity.abstractentity.IdEntity;
import jobs.opportunities.entity.common.SearchConditionType;

@Entity
public class SearchCondition extends IdEntity {

	@ManyToOne
	private JobSearch jobSearch;

	private int x = 0;
	private int y = 0;

	private SearchConditionType searchConditionType = SearchConditionType.SKILL;

	private String stringValue1;

	private String stringValue2;

	private Integer intValue1;

	private Integer intValue2;

	public JobSearch getJobSearch() {
		return jobSearch;
	}

	public void setJobSearch(JobSearch jobSearch) {
		this.jobSearch = jobSearch;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public SearchConditionType getSearchConditionType() {
		return searchConditionType;
	}

	public void setSearchConditionType(SearchConditionType searchConditionType) {
		this.searchConditionType = searchConditionType;
	}

	public String getStringValue1() {
		return stringValue1;
	}

	public void setStringValue1(String stringValue1) {
		this.stringValue1 = stringValue1;
	}

	public String getStringValue2() {
		return stringValue2;
	}

	public void setStringValue2(String stringValue2) {
		this.stringValue2 = stringValue2;
	}

	public Integer getIntValue1() {
		return intValue1;
	}

	public void setIntValue1(Integer intValue1) {
		this.intValue1 = intValue1;
	}

	public Integer getIntValue2() {
		return intValue2;
	}

	public void setIntValue2(Integer intValue2) {
		this.intValue2 = intValue2;
	}
}
