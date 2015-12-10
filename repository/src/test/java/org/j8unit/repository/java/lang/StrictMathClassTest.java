package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StrictMathClassTest
implements org.j8unit.repository.java.lang.StrictMathClassTests<java.lang.StrictMath> {

    @Override
    public Class<java.lang.StrictMath> createNewSUT() {
        return java.lang.StrictMath.class;
    }

}
