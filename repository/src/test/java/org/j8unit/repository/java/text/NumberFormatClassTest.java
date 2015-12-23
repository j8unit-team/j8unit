package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatClassTest
implements org.j8unit.repository.java.text.NumberFormatClassTests<java.text.NumberFormat> {

    @Override
    public Class<java.text.NumberFormat> createNewSUT() {
        return java.text.NumberFormat.class;
    }

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.java.text.NumberFormatClassTests.FieldClassTests<java.text.NumberFormat.Field> {

        @Override
        public Class<java.text.NumberFormat.Field> createNewSUT() {
            return java.text.NumberFormat.Field.class;
        }

    }

}
