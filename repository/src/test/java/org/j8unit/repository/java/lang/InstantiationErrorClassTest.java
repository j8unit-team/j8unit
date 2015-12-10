package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstantiationErrorClassTest
implements org.j8unit.repository.java.lang.InstantiationErrorClassTests<java.lang.InstantiationError> {

    @Override
    public Class<java.lang.InstantiationError> createNewSUT() {
        return java.lang.InstantiationError.class;
    }

}
