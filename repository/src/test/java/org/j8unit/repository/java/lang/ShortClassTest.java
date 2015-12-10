package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortClassTest
implements org.j8unit.repository.java.lang.ShortClassTests<java.lang.Short> {

    @Override
    public Class<java.lang.Short> createNewSUT() {
        return java.lang.Short.class;
    }

}
