package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ErrorType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorTypeTest
implements org.j8unit.repository.javax.lang.model.type.ErrorTypeTests<ErrorType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.ErrorType]

    @Override
    public ErrorType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.ErrorType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.ErrorType]

}
