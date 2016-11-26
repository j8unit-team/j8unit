package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.Parser;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Parser} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.xml.sax.ParserClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class ParserClassTest
implements ParserClassTests<Parser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.Parser]

    @Override
    public Class<Parser> createNewSUT() {
        return Parser.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.Parser]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.Parser]

}
