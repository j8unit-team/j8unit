package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageFormatClassTest
implements org.j8unit.repository.java.text.MessageFormatClassTests<java.text.MessageFormat> {

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.java.text.MessageFormatClassTests.FieldClassTests<java.text.MessageFormat.Field> {

        @Override
        public Class<java.text.MessageFormat.Field> createNewSUT() {
            return java.text.MessageFormat.Field.class;
        }

    }

    @Override
    public Class<java.text.MessageFormat> createNewSUT() {
        return java.text.MessageFormat.class;
    }

}
