package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationClassTest
implements org.j8unit.repository.java.text.AnnotationClassTests<java.text.Annotation> {

    @Override
    public Class<java.text.Annotation> createNewSUT() {
        return java.text.Annotation.class;
    }

}
