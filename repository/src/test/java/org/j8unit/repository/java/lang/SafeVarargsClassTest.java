package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SafeVarargsClassTest
implements org.j8unit.repository.java.lang.SafeVarargsClassTests<java.lang.SafeVarargs> {

    @Override
    public Class<java.lang.SafeVarargs> createNewSUT() {
        return java.lang.SafeVarargs.class;
    }

}
