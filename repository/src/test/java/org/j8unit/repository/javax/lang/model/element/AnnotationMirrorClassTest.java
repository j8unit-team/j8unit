package org.j8unit.repository.javax.lang.model.element;

import javax.lang.model.element.AnnotationMirror;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationMirrorClassTest
implements org.j8unit.repository.javax.lang.model.element.AnnotationMirrorClassTests<AnnotationMirror> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.element.AnnotationMirror]

    @Override
    public Class<AnnotationMirror> createNewSUT() {
        return AnnotationMirror.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.element.AnnotationMirror]

}
