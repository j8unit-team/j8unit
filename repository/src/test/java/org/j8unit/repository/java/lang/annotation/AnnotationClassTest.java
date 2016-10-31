package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.Annotation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationClassTest
implements org.j8unit.repository.java.lang.annotation.AnnotationClassTests<Annotation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Annotation]

    @Override
    public Class<Annotation> createNewSUT() {
        return Annotation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Annotation]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Annotation]

}
