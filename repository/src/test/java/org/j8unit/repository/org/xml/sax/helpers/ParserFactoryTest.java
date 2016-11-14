package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.ParserFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ParserFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.helpers.ParserFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ParserFactoryTest
implements ParserFactoryTests<ParserFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.helpers.ParserFactory]

    @Override
    public ParserFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.xml.sax.helpers.ParserFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.helpers.ParserFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.helpers.ParserFactory]

}
