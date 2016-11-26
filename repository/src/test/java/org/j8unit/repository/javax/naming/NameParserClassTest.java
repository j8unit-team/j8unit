package org.j8unit.repository.javax.naming;

import javax.naming.NameParser;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NameParser} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.naming.NameParserClassTests}).
 */
@RunWith(J8Unit4.class)
public class NameParserClassTest
implements NameParserClassTests<NameParser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NameParser]

    @Override
    public Class<NameParser> createNewSUT() {
        return NameParser.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NameParser]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NameParser]

}
