package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownTypeExceptionClassTest
implements org.j8unit.repository.javax.lang.model.type.UnknownTypeExceptionClassTests<javax.lang.model.type.UnknownTypeException> {

    @Override
    public Class<javax.lang.model.type.UnknownTypeException> createNewSUT() {
        return javax.lang.model.type.UnknownTypeException.class;
    }

}
