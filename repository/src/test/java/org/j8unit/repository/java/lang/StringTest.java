package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringTest
implements org.j8unit.repository.java.lang.StringTests<java.lang.String> {

    @Override
    public java.lang.String createNewSUT() {
        return new java.lang.String();
    }

}
