package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectClassTest
implements org.j8unit.repository.java.lang.ObjectClassTests<java.lang.Object> {

    @Override
    public Class<java.lang.Object> createNewSUT() {
        return java.lang.Object.class;
    }

}
