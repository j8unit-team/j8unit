package org.j8unit.repository.java.lang.instrument;

import java.lang.instrument.ClassFileTransformer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClassFileTransformer} (by simply reusing
 * the J8Unit test interface {@link ClassFileTransformerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClassFileTransformerClassTest
implements ClassFileTransformerClassTests<ClassFileTransformer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.instrument.ClassFileTransformer]

    @Override
    public Class<ClassFileTransformer> createNewSUT() {
        return ClassFileTransformer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.instrument.ClassFileTransformer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.instrument.ClassFileTransformer]

}
