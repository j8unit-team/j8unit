package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BooleanClassTest
implements org.j8unit.repository.java.lang.BooleanClassTests<java.lang.Boolean> {

    @Override
    public Class<java.lang.Boolean> createNewSUT() {
        return java.lang.Boolean.class;
    }

}
