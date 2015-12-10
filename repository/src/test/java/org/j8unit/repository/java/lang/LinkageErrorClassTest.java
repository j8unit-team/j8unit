package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkageErrorClassTest
implements org.j8unit.repository.java.lang.LinkageErrorClassTests<java.lang.LinkageError> {

    @Override
    public Class<java.lang.LinkageError> createNewSUT() {
        return java.lang.LinkageError.class;
    }

}
