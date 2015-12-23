package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateFormatClassTest
implements org.j8unit.repository.java.text.DateFormatClassTests<java.text.DateFormat> {

    @Override
    public Class<java.text.DateFormat> createNewSUT() {
        return java.text.DateFormat.class;
    }

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.java.text.DateFormatClassTests.FieldClassTests<java.text.DateFormat.Field> {

        @Override
        public Class<java.text.DateFormat.Field> createNewSUT() {
            return java.text.DateFormat.Field.class;
        }

    }

}
