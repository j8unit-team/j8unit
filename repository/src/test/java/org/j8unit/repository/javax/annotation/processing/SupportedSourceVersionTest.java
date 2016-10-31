package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedSourceVersion;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedSourceVersionTest
implements org.j8unit.repository.javax.annotation.processing.SupportedSourceVersionTests<SupportedSourceVersion> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.processing.SupportedSourceVersion]

    @Override
    public SupportedSourceVersion createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.processing.SupportedSourceVersion], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.processing.SupportedSourceVersion]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.processing.SupportedSourceVersion]

}
