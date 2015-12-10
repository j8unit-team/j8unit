package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatClassTest
implements org.j8unit.repository.java.lang.FloatClassTests<java.lang.Float> {

    @Override
    public Class<java.lang.Float> createNewSUT() {
        return java.lang.Float.class;
    }

}
