package jobs.opportunities.entity.common;

public interface Searchable {

	public static enum Searchability{
		SEARCHABLE, NOT_SEARCHABLE
	}


	Searchability getSearchability();

	void setSearchability(Searchability searchability);

}
