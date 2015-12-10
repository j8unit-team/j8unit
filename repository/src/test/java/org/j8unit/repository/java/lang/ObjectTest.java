package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectTest
implements org.j8unit.repository.java.lang.ObjectTests<java.lang.Object> {

    @Override
    public java.lang.Object createNewSUT() {
        return new java.lang.Object();
    }

}
