package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ErrorType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ErrorType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.ErrorTypeTests}).
 */

@RunWith(J8Unit4.class)
public class ErrorTypeTest
implements ErrorTypeTests<ErrorType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.ErrorType]

    @Override
    public ErrorType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.ErrorType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.ErrorType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.ErrorType]

}
