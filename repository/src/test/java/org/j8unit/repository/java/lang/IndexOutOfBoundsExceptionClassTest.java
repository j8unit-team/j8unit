package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IndexOutOfBoundsExceptionClassTest
implements org.j8unit.repository.java.lang.IndexOutOfBoundsExceptionClassTests<java.lang.IndexOutOfBoundsException> {

    @Override
    public Class<java.lang.IndexOutOfBoundsException> createNewSUT() {
        return java.lang.IndexOutOfBoundsException.class;
    }

}
