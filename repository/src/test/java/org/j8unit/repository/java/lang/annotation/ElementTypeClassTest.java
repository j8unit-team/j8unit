package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementTypeClassTest
implements org.j8unit.repository.java.lang.annotation.ElementTypeClassTests<java.lang.annotation.ElementType> {

    @Override
    public Class<java.lang.annotation.ElementType> createNewSUT() {
        return java.lang.annotation.ElementType.class;
    }

}
