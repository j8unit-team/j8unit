package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EnumConstantNotPresentException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.EnumConstantNotPresentExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class EnumConstantNotPresentExceptionTest
implements EnumConstantNotPresentExceptionTests<EnumConstantNotPresentException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.EnumConstantNotPresentException]

    @Override
    public EnumConstantNotPresentException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.EnumConstantNotPresentException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.EnumConstantNotPresentException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.EnumConstantNotPresentException]

}
