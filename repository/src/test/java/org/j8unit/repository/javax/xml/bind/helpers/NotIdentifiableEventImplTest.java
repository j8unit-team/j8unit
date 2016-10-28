package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.NotIdentifiableEventImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotIdentifiableEventImplTest
implements org.j8unit.repository.javax.xml.bind.helpers.NotIdentifiableEventImplTests<NotIdentifiableEventImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.NotIdentifiableEventImpl]

    @Override
    public NotIdentifiableEventImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.bind.helpers.NotIdentifiableEventImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.NotIdentifiableEventImpl]

}
