package org.j8unit.repository.java.io;

import java.io.ObjectInputValidation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectInputValidation} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.io.ObjectInputValidationClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectInputValidationClassTest
implements ObjectInputValidationClassTests<ObjectInputValidation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.ObjectInputValidation]

    @Override
    public Class<ObjectInputValidation> createNewSUT() {
        return ObjectInputValidation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.ObjectInputValidation]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.ObjectInputValidation]

}
