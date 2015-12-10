package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntegerClassTest
implements org.j8unit.repository.java.lang.IntegerClassTests<java.lang.Integer> {

    @Override
    public Class<java.lang.Integer> createNewSUT() {
        return java.lang.Integer.class;
    }

}
