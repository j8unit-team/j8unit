package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedTypeClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedTypeClassTests<AnnotatedType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedType]

    @Override
    public Class<AnnotatedType> createNewSUT() {
        return AnnotatedType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedType]

}
