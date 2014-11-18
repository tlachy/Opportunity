package jobs.opportunities.entity;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class JobSearch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Date created;

	private boolean isDeamon;

	private Date lastRun;

	@ManyToOne
	private Person person;

	//private Set<Interview> matches = new HashSet<Interview>();

}
