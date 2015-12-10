package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ThreadLocalClassTest
implements org.j8unit.repository.java.lang.ThreadLocalClassTests<java.lang.ThreadLocal> {

    @Override
    public Class<java.lang.ThreadLocal> createNewSUT() {
        return java.lang.ThreadLocal.class;
    }

}
