package org.j8unit.repository.javax.xml;

import javax.xml.XMLConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLConstantsTest
implements org.j8unit.repository.javax.xml.XMLConstantsTests<XMLConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.XMLConstants]

    @Override
    public XMLConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.XMLConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.XMLConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.XMLConstants]

}
