package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringClassTest
implements org.j8unit.repository.java.lang.StringClassTests<java.lang.String> {

    @Override
    public Class<java.lang.String> createNewSUT() {
        return java.lang.String.class;
    }

}
