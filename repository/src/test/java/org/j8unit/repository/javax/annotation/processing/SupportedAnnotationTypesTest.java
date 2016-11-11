package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedAnnotationTypes;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SupportedAnnotationTypes} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.annotation.processing.SupportedAnnotationTypesTests}).
 */

@RunWith(J8Unit4.class)
public class SupportedAnnotationTypesTest
implements SupportedAnnotationTypesTests<SupportedAnnotationTypes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.SupportedAnnotationTypes]

    @Override
    public SupportedAnnotationTypes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.SupportedAnnotationTypes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.SupportedAnnotationTypes]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.SupportedAnnotationTypes]

}
