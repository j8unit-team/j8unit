package org.j8unit.repository.java.util;

import java.util.AbstractList;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractListTest<E>
implements org.j8unit.repository.java.util.AbstractListTests<AbstractList<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractList]

    @Override
    public AbstractList<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractList], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractList]

}
