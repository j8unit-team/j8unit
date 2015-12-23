package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatClassTest
implements org.j8unit.repository.java.text.FormatClassTests<java.text.Format> {

    @Override
    public Class<java.text.Format> createNewSUT() {
        return java.text.Format.class;
    }

    @RunWith(J8Unit4.class)
    public static class FieldClassTest
    implements org.j8unit.repository.java.text.FormatClassTests.FieldClassTests<java.text.Format.Field> {

        @Override
        public Class<java.text.Format.Field> createNewSUT() {
            return java.text.Format.Field.class;
        }

    }

}
