package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NullPointerExceptionClassTest
implements org.j8unit.repository.java.lang.NullPointerExceptionClassTests<java.lang.NullPointerException> {

    @Override
    public Class<java.lang.NullPointerException> createNewSUT() {
        return java.lang.NullPointerException.class;
    }

}
