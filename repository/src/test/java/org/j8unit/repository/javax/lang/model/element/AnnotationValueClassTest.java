package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationValueClassTest
implements org.j8unit.repository.javax.lang.model.element.AnnotationValueClassTests<javax.lang.model.element.AnnotationValue> {

    @Override
    public Class<javax.lang.model.element.AnnotationValue> createNewSUT() {
        return javax.lang.model.element.AnnotationValue.class;
    }

}
