package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringBufferTest
implements org.j8unit.repository.java.lang.StringBufferTests<java.lang.StringBuffer> {

    @Override
    public java.lang.StringBuffer createNewSUT() {
        return new java.lang.StringBuffer();
    }

}
