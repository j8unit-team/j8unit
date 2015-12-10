package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadAttributeValueExpExceptionTest
implements org.j8unit.repository.javax.management.BadAttributeValueExpExceptionTests<javax.management.BadAttributeValueExpException> {

    @Override
    public javax.management.BadAttributeValueExpException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.BadAttributeValueExpException] available.");
    }

}
