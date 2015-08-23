package jobs.opportunities.entity.abstractentity;


import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SearchableVisibleEntity extends IdEntity implements Visible, Searchable {

    private Visibility visibility = Visible.Visibility.PUBLICLY_VISIBLE;

    private Searchability searchability = Searchable.Searchability.SEARCHABLE;

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Searchability getSearchability() {
        return searchability;
    }

    public void setSearchability(Searchability searchability) {
        this.searchability = searchability;
    }

}
