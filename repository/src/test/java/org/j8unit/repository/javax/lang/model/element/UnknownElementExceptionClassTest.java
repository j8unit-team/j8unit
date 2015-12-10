package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownElementExceptionClassTest
implements org.j8unit.repository.javax.lang.model.element.UnknownElementExceptionClassTests<javax.lang.model.element.UnknownElementException> {

    @Override
    public Class<javax.lang.model.element.UnknownElementException> createNewSUT() {
        return javax.lang.model.element.UnknownElementException.class;
    }

}
