package org.j8unit.repository.java.text;

import java.text.Format;
import java.text.Format.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Format} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.text.FormatClassTests}).
 */

@RunWith(J8Unit4.class)
public class FormatClassTest
implements FormatClassTests<Format> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.Format]

    @Override
    public Class<Format> createNewSUT() {
        return Format.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.Format]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.Format]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Field} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.java.text.FormatClassTests.FieldClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.java.text.FormatClassTests.FieldClassTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.Format$Field]

        @Override
        public Class<Field> createNewSUT() {
            return Field.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.Format$Field]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.text.Format$Field]

    }

}
