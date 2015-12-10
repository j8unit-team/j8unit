package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberClassTest
implements org.j8unit.repository.java.lang.NumberClassTests<java.lang.Number> {

    @Override
    public Class<java.lang.Number> createNewSUT() {
        return java.lang.Number.class;
    }

}
