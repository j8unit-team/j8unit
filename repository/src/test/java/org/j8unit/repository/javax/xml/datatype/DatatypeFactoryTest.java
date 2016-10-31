package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeFactoryTest
implements org.j8unit.repository.javax.xml.datatype.DatatypeFactoryTests<DatatypeFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.datatype.DatatypeFactory]

    @Override
    public DatatypeFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.datatype.DatatypeFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.datatype.DatatypeFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.datatype.DatatypeFactory]

}
