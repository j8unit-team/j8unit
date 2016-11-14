package org.j8unit.repository.java.text;

import java.text.Format;
import java.text.Format.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Format} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.text.FormatTests}).
 */

@RunWith(J8Unit4.class)
public class FormatTest
implements FormatTests<Format> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Format]

    @Override
    public Format createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.Format], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Format]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Format]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Field} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.text.FormatTests.FieldTests}).
     */

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.FormatTests.FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Format$Field]

        @Override
        public Field createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.Format.Field], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.Format$Field]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.Format$Field]

    }

}
