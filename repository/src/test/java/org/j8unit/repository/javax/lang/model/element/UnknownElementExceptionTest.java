package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.UnknownElementException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownElementExceptionTest
implements org.j8unit.repository.javax.lang.model.element.UnknownElementExceptionTests<UnknownElementException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.element.UnknownElementException]

    @Override
    public UnknownElementException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.lang.model.element.UnknownElementException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.element.UnknownElementException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.element.UnknownElementException]

}
