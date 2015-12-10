package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedAnnotationTypesClassTest
implements org.j8unit.repository.javax.annotation.processing.SupportedAnnotationTypesClassTests<javax.annotation.processing.SupportedAnnotationTypes> {

    @Override
    public Class<javax.annotation.processing.SupportedAnnotationTypes> createNewSUT() {
        return javax.annotation.processing.SupportedAnnotationTypes.class;
    }

}
