package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedAnnotationTypes;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedAnnotationTypesTest
implements org.j8unit.repository.javax.annotation.processing.SupportedAnnotationTypesTests<SupportedAnnotationTypes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.SupportedAnnotationTypes]

    @Override
    public SupportedAnnotationTypes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.SupportedAnnotationTypes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.SupportedAnnotationTypes]

}
