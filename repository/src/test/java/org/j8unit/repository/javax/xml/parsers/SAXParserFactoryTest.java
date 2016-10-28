package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.SAXParserFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXParserFactoryTest
implements org.j8unit.repository.javax.xml.parsers.SAXParserFactoryTests<SAXParserFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.SAXParserFactory]

    @Override
    public SAXParserFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.parsers.SAXParserFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.SAXParserFactory]

}
