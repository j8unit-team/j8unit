package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassDefinitionClassTest
implements org.j8unit.repository.java.lang.instrument.ClassDefinitionClassTests<java.lang.instrument.ClassDefinition> {

    @Override
    public Class<java.lang.instrument.ClassDefinition> createNewSUT() {
        return java.lang.instrument.ClassDefinition.class;
    }

}
