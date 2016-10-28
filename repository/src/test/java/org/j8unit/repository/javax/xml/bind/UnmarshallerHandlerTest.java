package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.UnmarshallerHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshallerHandlerTest
implements org.j8unit.repository.javax.xml.bind.UnmarshallerHandlerTests<UnmarshallerHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.UnmarshallerHandler]

    @Override
    public UnmarshallerHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.UnmarshallerHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.UnmarshallerHandler]

}
