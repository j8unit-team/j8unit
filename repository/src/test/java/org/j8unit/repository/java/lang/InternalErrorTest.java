package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InternalErrorTest
implements org.j8unit.repository.java.lang.InternalErrorTests<java.lang.InternalError> {

    @Override
    public java.lang.InternalError createNewSUT() {
        return new java.lang.InternalError();
    }

}
