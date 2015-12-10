package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleFormatterTest
implements org.j8unit.repository.java.util.logging.SimpleFormatterTests<java.util.logging.SimpleFormatter> {

    @Override
    public java.util.logging.SimpleFormatter createNewSUT() {
        return new java.util.logging.SimpleFormatter();
    }

}
