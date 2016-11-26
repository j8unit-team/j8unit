package org.j8unit.repository.java.util;

import java.util.FormattableFlags;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FormattableFlags} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.FormattableFlagsClassTests}).
 */
@RunWith(J8Unit4.class)
public class FormattableFlagsClassTest
implements FormattableFlagsClassTests<FormattableFlags> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.FormattableFlags]

    @Override
    public Class<FormattableFlags> createNewSUT() {
        return FormattableFlags.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.FormattableFlags]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.FormattableFlags]

}
