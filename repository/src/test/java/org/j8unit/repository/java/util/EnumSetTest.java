package org.j8unit.repository.java.util;

import java.util.EnumSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EnumSetTest<E extends Enum<E>>
implements org.j8unit.repository.java.util.EnumSetTests<EnumSet<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EnumSet]

    @Override
    public EnumSet<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.EnumSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.EnumSet]

}
