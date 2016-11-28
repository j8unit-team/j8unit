package org.j8unit.repository.java.security.spec;

import java.security.spec.ECField;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ECField} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.spec.ECFieldClassTests}).
 */
@RunWith(J8Unit4.class)
public class ECFieldClassTest
implements ECFieldClassTests<ECField> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.ECField]

    @Override
    public Class<ECField> createNewSUT() {
        return ECField.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.ECField]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.ECField]

}
