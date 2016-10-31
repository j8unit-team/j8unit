package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.ClassDefinition;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassDefinitionTest
implements org.j8unit.repository.java.lang.instrument.ClassDefinitionTests<ClassDefinition> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.instrument.ClassDefinition]

    @Override
    public ClassDefinition createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.instrument.ClassDefinition], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.instrument.ClassDefinition]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.instrument.ClassDefinition]

}
