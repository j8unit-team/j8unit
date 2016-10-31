package org.j8unit.repository.javax.management;

import javax.management.BadStringOperationException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadStringOperationExceptionTest
implements org.j8unit.repository.javax.management.BadStringOperationExceptionTests<BadStringOperationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.BadStringOperationException]

    @Override
    public BadStringOperationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.BadStringOperationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.BadStringOperationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.BadStringOperationException]

}
