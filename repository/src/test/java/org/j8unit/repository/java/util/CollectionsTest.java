package org.j8unit.repository.java.util;

import java.util.Collections;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollectionsTest
implements org.j8unit.repository.java.util.CollectionsTests<Collections> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Collections]

    @Override
    public Collections createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Collections], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Collections]

}
