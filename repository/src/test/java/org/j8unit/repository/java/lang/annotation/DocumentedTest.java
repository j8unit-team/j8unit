package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Documented;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentedTest
implements org.j8unit.repository.java.lang.annotation.DocumentedTests<Documented> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Documented]

    @Override
    public Documented createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.annotation.Documented], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.Documented]

}
