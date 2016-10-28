package org.j8unit.repository.java.text;

import java.text.Format;
import java.text.Format.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatTest
implements org.j8unit.repository.java.text.FormatTests<Format> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Format]

    @Override
    public Format createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.Format], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Format]

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.FormatTests.FieldTests<Field> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Format$Field]

        @Override
        public Field createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.Format.Field], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.Format$Field]

    }

}
