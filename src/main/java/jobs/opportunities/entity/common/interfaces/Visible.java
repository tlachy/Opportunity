package jobs.opportunities.entity.common.interfaces;

public interface Visible {

	public static enum Visibility {
		NOT_VISIBLE, VISIBLE_IN_INTERVIEW, PUBLICLY_VISIBLE
	}

	Visibility getVisibility();

	void setVisibility(Visibility visibility);

}


