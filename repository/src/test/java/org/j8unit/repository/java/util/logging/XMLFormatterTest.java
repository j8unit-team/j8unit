package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLFormatterTest
implements org.j8unit.repository.java.util.logging.XMLFormatterTests<java.util.logging.XMLFormatter> {

    @Override
    public java.util.logging.XMLFormatter createNewSUT() {
        return new java.util.logging.XMLFormatter();
    }

}
