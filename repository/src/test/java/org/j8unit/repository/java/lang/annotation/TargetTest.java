package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Target;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TargetTest
implements org.j8unit.repository.java.lang.annotation.TargetTests<Target> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Target]

    @Override
    public Target createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.annotation.Target], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.annotation.Target]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.annotation.Target]

}
