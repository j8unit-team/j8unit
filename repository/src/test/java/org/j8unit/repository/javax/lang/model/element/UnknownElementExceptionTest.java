package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownElementExceptionTest
implements org.j8unit.repository.javax.lang.model.element.UnknownElementExceptionTests<javax.lang.model.element.UnknownElementException> {

    @Override
    public javax.lang.model.element.UnknownElementException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.lang.model.element.UnknownElementException] available.");
    }

}
