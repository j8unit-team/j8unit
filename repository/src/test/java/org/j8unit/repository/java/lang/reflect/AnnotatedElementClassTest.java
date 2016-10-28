package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedElementClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedElementClassTests<AnnotatedElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedElement]

    @Override
    public Class<AnnotatedElement> createNewSUT() {
        return AnnotatedElement.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedElement]

}
