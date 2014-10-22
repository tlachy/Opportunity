package jobs.opportunities.entity.common;

public interface Visible {

	public static enum Visibility {
		NOT_VISIBLE, ONLY_IN_INTERVIEW, PUBLIC
	}

	Visibility getVisibility();

	void setVisibility(Visibility visibility);

}


