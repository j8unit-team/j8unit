package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.ClassFileTransformer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassFileTransformerClassTest
implements org.j8unit.repository.java.lang.instrument.ClassFileTransformerClassTests<ClassFileTransformer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.instrument.ClassFileTransformer]

    @Override
    public Class<ClassFileTransformer> createNewSUT() {
        return ClassFileTransformer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.instrument.ClassFileTransformer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.instrument.ClassFileTransformer]

}
