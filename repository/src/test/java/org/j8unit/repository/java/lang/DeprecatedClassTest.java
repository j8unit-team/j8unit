package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeprecatedClassTest
implements org.j8unit.repository.java.lang.DeprecatedClassTests<java.lang.Deprecated> {

    @Override
    public Class<java.lang.Deprecated> createNewSUT() {
        return java.lang.Deprecated.class;
    }

}
