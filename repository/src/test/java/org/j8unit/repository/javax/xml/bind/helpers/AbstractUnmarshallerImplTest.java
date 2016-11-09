package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractUnmarshallerImpl} (by simply
 * reusing the J8Unit test interface {@link AbstractUnmarshallerImplTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractUnmarshallerImplTest
implements AbstractUnmarshallerImplTests<AbstractUnmarshallerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.AbstractUnmarshallerImpl]

    @Override
    public AbstractUnmarshallerImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.helpers.AbstractUnmarshallerImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.helpers.AbstractUnmarshallerImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.helpers.AbstractUnmarshallerImpl]

}
