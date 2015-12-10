package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstantiationExceptionClassTest
implements org.j8unit.repository.java.lang.InstantiationExceptionClassTests<java.lang.InstantiationException> {

    @Override
    public Class<java.lang.InstantiationException> createNewSUT() {
        return java.lang.InstantiationException.class;
    }

}
