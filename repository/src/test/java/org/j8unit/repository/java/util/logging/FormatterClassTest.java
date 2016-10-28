package org.j8unit.repository.java.util.logging;

import java.util.logging.Formatter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormatterClassTest
implements org.j8unit.repository.java.util.logging.FormatterClassTests<Formatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Formatter]

    @Override
    public Class<Formatter> createNewSUT() {
        return Formatter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Formatter]

}
