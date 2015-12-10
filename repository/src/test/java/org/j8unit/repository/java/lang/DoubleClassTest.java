package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleClassTest
implements org.j8unit.repository.java.lang.DoubleClassTests<java.lang.Double> {

    @Override
    public Class<java.lang.Double> createNewSUT() {
        return java.lang.Double.class;
    }

}
