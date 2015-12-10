package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLFormatterClassTest
implements org.j8unit.repository.java.util.logging.XMLFormatterClassTests<java.util.logging.XMLFormatter> {

    @Override
    public Class<java.util.logging.XMLFormatter> createNewSUT() {
        return java.util.logging.XMLFormatter.class;
    }

}
