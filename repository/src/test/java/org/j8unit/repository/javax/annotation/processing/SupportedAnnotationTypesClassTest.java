package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedAnnotationTypes;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedAnnotationTypesClassTest
implements org.j8unit.repository.javax.annotation.processing.SupportedAnnotationTypesClassTests<SupportedAnnotationTypes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.SupportedAnnotationTypes]

    @Override
    public Class<SupportedAnnotationTypes> createNewSUT() {
        return SupportedAnnotationTypes.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.SupportedAnnotationTypes]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.SupportedAnnotationTypes]

}
