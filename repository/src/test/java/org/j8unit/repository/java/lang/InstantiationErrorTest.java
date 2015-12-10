package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstantiationErrorTest
implements org.j8unit.repository.java.lang.InstantiationErrorTests<java.lang.InstantiationError> {

    @Override
    public java.lang.InstantiationError createNewSUT() {
        return new java.lang.InstantiationError();
    }

}
