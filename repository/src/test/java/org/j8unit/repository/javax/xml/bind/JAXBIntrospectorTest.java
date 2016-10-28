package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBIntrospector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBIntrospectorTest
implements org.j8unit.repository.javax.xml.bind.JAXBIntrospectorTests<JAXBIntrospector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBIntrospector]

    @Override
    public JAXBIntrospector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.JAXBIntrospector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBIntrospector]

}
