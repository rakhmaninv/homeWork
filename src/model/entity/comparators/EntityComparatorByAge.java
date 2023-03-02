package model.entity.comparators;

import java.util.Comparator;

import model.entity.BasicEntity;

public class EntityComparatorByAge<T extends BasicEntity> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}