package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class InheritableThreadLocalClassTest
implements org.j8unit.repository.java.lang.InheritableThreadLocalClassTests<java.lang.InheritableThreadLocal> {

    @Override
    public Class<java.lang.InheritableThreadLocal> createNewSUT() {
        return java.lang.InheritableThreadLocal.class;
    }

}
