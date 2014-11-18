package jobs.opportunities.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jobs.opportunities.entity.common.SearchConditionType;

public class SearchCondition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	private JobSearch jobSearch;

	private SearchConditionType searchConditionType = SearchConditionType.SKILL;




}
