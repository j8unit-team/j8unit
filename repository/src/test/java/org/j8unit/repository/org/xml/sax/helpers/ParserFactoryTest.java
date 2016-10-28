package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.helpers.ParserFactory;

@RunWith(J8Unit4.class)
public class ParserFactoryTest
implements org.j8unit.repository.org.xml.sax.helpers.ParserFactoryTests<ParserFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.helpers.ParserFactory]

    @Override
    public ParserFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [org.xml.sax.helpers.ParserFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.helpers.ParserFactory]

}
