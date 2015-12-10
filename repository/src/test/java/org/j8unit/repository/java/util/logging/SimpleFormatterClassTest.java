package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleFormatterClassTest
implements org.j8unit.repository.java.util.logging.SimpleFormatterClassTests<java.util.logging.SimpleFormatter> {

    @Override
    public Class<java.util.logging.SimpleFormatter> createNewSUT() {
        return java.util.logging.SimpleFormatter.class;
    }

}
