package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeClassTest
implements org.j8unit.repository.java.lang.RuntimeClassTests<java.lang.Runtime> {

    @Override
    public Class<java.lang.Runtime> createNewSUT() {
        return java.lang.Runtime.class;
    }

}
