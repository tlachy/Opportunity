package jobs.opportunities.entity.abstractentity;


import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ValueEntity<T> extends SearchableVisibleEntity {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
