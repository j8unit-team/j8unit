package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LinkageErrorTest
implements org.j8unit.repository.java.lang.LinkageErrorTests<java.lang.LinkageError> {

    @Override
    public java.lang.LinkageError createNewSUT() {
        return new java.lang.LinkageError();
    }

}
