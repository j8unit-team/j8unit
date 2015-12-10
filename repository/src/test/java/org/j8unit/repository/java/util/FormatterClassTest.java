package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatterClassTest
implements org.j8unit.repository.java.util.FormatterClassTests<java.util.Formatter> {

    @RunWith(J8Unit4.class)
    public static class BigDecimalLayoutFormClassTest
    implements org.j8unit.repository.java.util.FormatterClassTests.BigDecimalLayoutFormClassTests<java.util.Formatter.BigDecimalLayoutForm> {

        @Override
        public Class<java.util.Formatter.BigDecimalLayoutForm> createNewSUT() {
            return java.util.Formatter.BigDecimalLayoutForm.class;
        }

    }

    @Override
    public Class<java.util.Formatter> createNewSUT() {
        return java.util.Formatter.class;
    }

}
