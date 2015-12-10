package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringBuilderTest
implements org.j8unit.repository.java.lang.StringBuilderTests<java.lang.StringBuilder> {

    @Override
    public java.lang.StringBuilder createNewSUT() {
        return new java.lang.StringBuilder();
    }

}
