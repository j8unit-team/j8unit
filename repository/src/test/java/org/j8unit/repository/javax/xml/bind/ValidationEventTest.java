package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.ValidationEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventTest
implements org.j8unit.repository.javax.xml.bind.ValidationEventTests<ValidationEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.ValidationEvent]

    @Override
    public ValidationEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.ValidationEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.ValidationEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.ValidationEvent]

}
