package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ClassClassTest
implements org.j8unit.repository.java.lang.ClassClassTests<java.lang.Class> {

    @Override
    public Class<java.lang.Class> createNewSUT() {
        return java.lang.Class.class;
    }

}
