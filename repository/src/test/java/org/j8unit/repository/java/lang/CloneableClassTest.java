package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloneableClassTest
implements org.j8unit.repository.java.lang.CloneableClassTests<java.lang.Cloneable> {

    @Override
    public Class<java.lang.Cloneable> createNewSUT() {
        return java.lang.Cloneable.class;
    }

}
