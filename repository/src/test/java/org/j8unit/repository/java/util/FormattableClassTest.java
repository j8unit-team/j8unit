package org.j8unit.repository.java.util;

import java.util.Formattable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Formattable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.FormattableClassTests}).
 */
@RunWith(J8Unit4.class)
public class FormattableClassTest
implements FormattableClassTests<Formattable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Formattable]

    @Override
    public Class<Formattable> createNewSUT() {
        return Formattable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Formattable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Formattable]

}
