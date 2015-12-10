package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorClassTest
implements org.j8unit.repository.java.lang.ErrorClassTests<java.lang.Error> {

    @Override
    public Class<java.lang.Error> createNewSUT() {
        return java.lang.Error.class;
    }

}
