package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InheritedClassTest
implements org.j8unit.repository.java.lang.annotation.InheritedClassTests<java.lang.annotation.Inherited> {

    @Override
    public Class<java.lang.annotation.Inherited> createNewSUT() {
        return java.lang.annotation.Inherited.class;
    }

}
