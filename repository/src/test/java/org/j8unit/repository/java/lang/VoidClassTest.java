package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VoidClassTest
implements org.j8unit.repository.java.lang.VoidClassTests<java.lang.Void> {

    @Override
    public Class<java.lang.Void> createNewSUT() {
        return java.lang.Void.class;
    }

}
