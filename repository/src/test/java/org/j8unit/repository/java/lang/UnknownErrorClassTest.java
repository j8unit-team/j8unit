package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownErrorClassTest
implements org.j8unit.repository.java.lang.UnknownErrorClassTests<java.lang.UnknownError> {

    @Override
    public Class<java.lang.UnknownError> createNewSUT() {
        return java.lang.UnknownError.class;
    }

}
