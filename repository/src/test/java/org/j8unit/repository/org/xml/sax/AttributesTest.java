package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;

@RunWith(J8Unit4.class)
public class AttributesTest
implements org.j8unit.repository.org.xml.sax.AttributesTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.Attributes]

    @Override
    public Attributes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.Attributes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.Attributes]

}
