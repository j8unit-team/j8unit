package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentedClassTest
implements org.j8unit.repository.java.lang.annotation.DocumentedClassTests<java.lang.annotation.Documented> {

    @Override
    public Class<java.lang.annotation.Documented> createNewSUT() {
        return java.lang.annotation.Documented.class;
    }

}
