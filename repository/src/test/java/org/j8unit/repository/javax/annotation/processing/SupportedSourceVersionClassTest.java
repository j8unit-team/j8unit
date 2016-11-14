package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.SupportedSourceVersion;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SupportedSourceVersion} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.annotation.processing.SupportedSourceVersionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SupportedSourceVersionClassTest
implements SupportedSourceVersionClassTests<SupportedSourceVersion> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.SupportedSourceVersion]

    @Override
    public Class<SupportedSourceVersion> createNewSUT() {
        return SupportedSourceVersion.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.SupportedSourceVersion]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.SupportedSourceVersion]

}
