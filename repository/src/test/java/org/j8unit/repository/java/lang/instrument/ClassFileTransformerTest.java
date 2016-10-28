package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.ClassFileTransformer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassFileTransformerTest
implements org.j8unit.repository.java.lang.instrument.ClassFileTransformerTests<ClassFileTransformer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.ClassFileTransformer]

    @Override
    public ClassFileTransformer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.instrument.ClassFileTransformer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.ClassFileTransformer]

}
