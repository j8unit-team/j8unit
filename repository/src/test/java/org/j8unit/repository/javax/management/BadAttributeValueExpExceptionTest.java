package org.j8unit.repository.javax.management;

import javax.management.BadAttributeValueExpException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadAttributeValueExpExceptionTest
implements org.j8unit.repository.javax.management.BadAttributeValueExpExceptionTests<BadAttributeValueExpException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.BadAttributeValueExpException]

    @Override
    public BadAttributeValueExpException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.BadAttributeValueExpException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.BadAttributeValueExpException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.BadAttributeValueExpException]

}
