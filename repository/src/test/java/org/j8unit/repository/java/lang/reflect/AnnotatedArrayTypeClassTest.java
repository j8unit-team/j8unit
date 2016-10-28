package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedArrayTypeClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedArrayTypeClassTests<AnnotatedArrayType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedArrayType]

    @Override
    public Class<AnnotatedArrayType> createNewSUT() {
        return AnnotatedArrayType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedArrayType]

}
