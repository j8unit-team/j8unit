package org.j8unit.repository.java.text;

import java.text.Annotation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationTest
implements org.j8unit.repository.java.text.AnnotationTests<Annotation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Annotation]

    @Override
    public Annotation createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.Annotation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Annotation]

}
