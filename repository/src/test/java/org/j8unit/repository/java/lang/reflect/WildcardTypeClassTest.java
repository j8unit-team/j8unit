package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WildcardTypeClassTest
implements org.j8unit.repository.java.lang.reflect.WildcardTypeClassTests<java.lang.reflect.WildcardType> {

    @Override
    public Class<java.lang.reflect.WildcardType> createNewSUT() {
        return java.lang.reflect.WildcardType.class;
    }

}
