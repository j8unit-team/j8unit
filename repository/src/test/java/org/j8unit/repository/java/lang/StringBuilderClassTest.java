package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringBuilderClassTest
implements org.j8unit.repository.java.lang.StringBuilderClassTests<java.lang.StringBuilder> {

    @Override
    public Class<java.lang.StringBuilder> createNewSUT() {
        return java.lang.StringBuilder.class;
    }

}
