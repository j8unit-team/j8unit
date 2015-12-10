package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringBufferClassTest
implements org.j8unit.repository.java.lang.StringBufferClassTests<java.lang.StringBuffer> {

    @Override
    public Class<java.lang.StringBuffer> createNewSUT() {
        return java.lang.StringBuffer.class;
    }

}
