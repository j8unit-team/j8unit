package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeNotPresentExceptionTest
implements org.j8unit.repository.java.lang.TypeNotPresentExceptionTests<TypeNotPresentException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.TypeNotPresentException]

    @Override
    public TypeNotPresentException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.TypeNotPresentException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.TypeNotPresentException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.TypeNotPresentException]

}
