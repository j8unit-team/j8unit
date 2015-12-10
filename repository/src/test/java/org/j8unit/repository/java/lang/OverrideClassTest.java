package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OverrideClassTest
implements org.j8unit.repository.java.lang.OverrideClassTests<java.lang.Override> {

    @Override
    public Class<java.lang.Override> createNewSUT() {
        return java.lang.Override.class;
    }

}
