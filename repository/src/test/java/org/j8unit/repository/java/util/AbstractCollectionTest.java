package org.j8unit.repository.java.util;

import java.util.AbstractCollection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractCollectionTest<E>
implements org.j8unit.repository.java.util.AbstractCollectionTests<AbstractCollection<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.AbstractCollection]

    @Override
    public AbstractCollection<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.AbstractCollection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.AbstractCollection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.AbstractCollection]

}
