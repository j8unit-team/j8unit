package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEventLocator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventLocatorTest
implements org.j8unit.repository.javax.xml.bind.ValidationEventLocatorTests<ValidationEventLocator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.ValidationEventLocator]

    @Override
    public ValidationEventLocator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.ValidationEventLocator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.ValidationEventLocator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.ValidationEventLocator]

}
