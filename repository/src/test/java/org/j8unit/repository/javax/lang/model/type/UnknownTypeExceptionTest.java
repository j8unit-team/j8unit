package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownTypeExceptionTest
implements org.j8unit.repository.javax.lang.model.type.UnknownTypeExceptionTests<javax.lang.model.type.UnknownTypeException> {

    @Override
    public javax.lang.model.type.UnknownTypeException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.lang.model.type.UnknownTypeException] available.");
    }

}
