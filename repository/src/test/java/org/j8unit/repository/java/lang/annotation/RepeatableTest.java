package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Repeatable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RepeatableTest
implements org.j8unit.repository.java.lang.annotation.RepeatableTests<Repeatable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Repeatable]

    @Override
    public Repeatable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.annotation.Repeatable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Repeatable]

}
