package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SafeVarargsClassTest
implements org.j8unit.repository.java.lang.SafeVarargsClassTests<SafeVarargs> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.SafeVarargs]

    @Override
    public Class<SafeVarargs> createNewSUT() {
        return SafeVarargs.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.SafeVarargs]

}
