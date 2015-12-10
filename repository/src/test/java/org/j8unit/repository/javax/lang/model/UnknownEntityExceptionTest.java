package org.j8unit.repository.javax.lang.model;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownEntityExceptionTest
implements org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests<javax.lang.model.UnknownEntityException> {

    @Override
    public javax.lang.model.UnknownEntityException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.lang.model.UnknownEntityException] available.");
    }

}
