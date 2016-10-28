package org.j8unit.repository.javax.print;

import javax.print.AttributeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeExceptionTest
implements org.j8unit.repository.javax.print.AttributeExceptionTests<AttributeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.AttributeException]

    @Override
    public AttributeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.AttributeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.AttributeException]

}
