package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemClassTest
implements org.j8unit.repository.java.lang.SystemClassTests<java.lang.System> {

    @Override
    public Class<java.lang.System> createNewSUT() {
        return java.lang.System.class;
    }

}
