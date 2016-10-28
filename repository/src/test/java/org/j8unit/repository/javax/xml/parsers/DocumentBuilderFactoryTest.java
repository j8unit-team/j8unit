package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.DocumentBuilderFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentBuilderFactoryTest
implements org.j8unit.repository.javax.xml.parsers.DocumentBuilderFactoryTests<DocumentBuilderFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.DocumentBuilderFactory]

    @Override
    public DocumentBuilderFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.parsers.DocumentBuilderFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.parsers.DocumentBuilderFactory]

}
