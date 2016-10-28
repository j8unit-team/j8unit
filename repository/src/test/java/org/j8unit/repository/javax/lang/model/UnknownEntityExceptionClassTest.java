package org.j8unit.repository.javax.lang.model;

import javax.lang.model.UnknownEntityException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownEntityExceptionClassTest
implements org.j8unit.repository.javax.lang.model.UnknownEntityExceptionClassTests<UnknownEntityException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.UnknownEntityException]

    @Override
    public Class<UnknownEntityException> createNewSUT() {
        return UnknownEntityException.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.UnknownEntityException]

}
