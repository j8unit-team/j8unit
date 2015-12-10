package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatterClassTest
implements org.j8unit.repository.java.util.logging.FormatterClassTests<java.util.logging.Formatter> {

    @Override
    public Class<java.util.logging.Formatter> createNewSUT() {
        return java.util.logging.Formatter.class;
    }

}
