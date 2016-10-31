package org.j8unit.repository.java.util;

import java.util.Objects;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectsTest
implements org.j8unit.repository.java.util.ObjectsTests<Objects> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Objects]

    @Override
    public Objects createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Objects], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Objects]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Objects]

}
