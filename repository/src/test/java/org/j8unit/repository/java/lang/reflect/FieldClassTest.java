package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FieldClassTest
implements org.j8unit.repository.java.lang.reflect.FieldClassTests<java.lang.reflect.Field> {

    @Override
    public Class<java.lang.reflect.Field> createNewSUT() {
        return java.lang.reflect.Field.class;
    }

}
