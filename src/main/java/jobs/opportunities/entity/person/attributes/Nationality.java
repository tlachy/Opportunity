package jobs.opportunities.entity.person.attributes;


import jobs.opportunities.entity.Person;
import jobs.opportunities.entity.common.interfaces.Searchable;
import jobs.opportunities.entity.common.interfaces.Visible;

import javax.persistence.*;

@Entity
public class Nationality implements Searchable, Visible {

    public static enum NationalityEnum {
        Czech, Slovak, American, Poland // find ISO norm
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Person person;

    @Enumerated(EnumType.STRING)
    private NationalityEnum value;

    private Visibility visibility = Visibility.PUBLICLY_VISIBLE;

    private Searchability searchability = Searchability.SEARCHABLE;

    //<editor-fold desc="Getters&Setters" >
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

    public NationalityEnum getValue() {
        return value;
    }

    public void setValue(NationalityEnum value) {
        this.value = value;
    }

    @Override
    public Visibility getVisibility() {
        return visibility;
    }

    @Override
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public Searchability getSearchability() {
        return searchability;
    }

    @Override
    public void setSearchability(Searchability searchability) {
        this.searchability = searchability;
    }
    //</editor-fold>
}
