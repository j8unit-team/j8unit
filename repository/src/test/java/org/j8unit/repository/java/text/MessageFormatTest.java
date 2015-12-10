package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageFormatTest
implements org.j8unit.repository.java.text.MessageFormatTests<java.text.MessageFormat> {

    @RunWith(J8Unit4.class)
    public static class FieldTest
    implements org.j8unit.repository.java.text.MessageFormatTests.FieldTests<java.text.MessageFormat.Field> {

        @Override
        public java.text.MessageFormat.Field createNewSUT() {
            throw new AssertionError("There is no default constructor for [java.text.MessageFormat.Field] available.");
        }

    }

    @Override
    public java.text.MessageFormat createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.text.MessageFormat] available.");
    }

}
