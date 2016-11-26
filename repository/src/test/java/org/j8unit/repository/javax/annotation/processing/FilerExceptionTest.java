package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.FilerException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FilerException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.FilerExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class FilerExceptionTest
implements FilerExceptionTests<FilerException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.FilerException]

    @Override
    public FilerException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.annotation.processing.FilerException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.FilerException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.FilerException]

}
