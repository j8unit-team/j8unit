package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Retention;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RetentionTest
implements org.j8unit.repository.java.lang.annotation.RetentionTests<Retention> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Retention]

    @Override
    public Retention createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.annotation.Retention], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.annotation.Retention]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.annotation.Retention]

}
