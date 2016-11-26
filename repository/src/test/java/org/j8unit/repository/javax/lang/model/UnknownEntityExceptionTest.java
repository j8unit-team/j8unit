package org.j8unit.repository.javax.lang.model;

import javax.lang.model.UnknownEntityException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnknownEntityException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class UnknownEntityExceptionTest
implements UnknownEntityExceptionTests<UnknownEntityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.UnknownEntityException]

    @Override
    public UnknownEntityException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.UnknownEntityException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.UnknownEntityException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.UnknownEntityException]

}
