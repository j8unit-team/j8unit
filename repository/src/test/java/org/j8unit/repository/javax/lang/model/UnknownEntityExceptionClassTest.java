package org.j8unit.repository.javax.lang.model;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownEntityExceptionClassTest
implements org.j8unit.repository.javax.lang.model.UnknownEntityExceptionClassTests<javax.lang.model.UnknownEntityException> {

    @Override
    public Class<javax.lang.model.UnknownEntityException> createNewSUT() {
        return javax.lang.model.UnknownEntityException.class;
    }

}
