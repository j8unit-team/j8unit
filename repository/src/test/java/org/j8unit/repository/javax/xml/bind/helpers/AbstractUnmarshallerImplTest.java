package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractUnmarshallerImplTest
implements org.j8unit.repository.javax.xml.bind.helpers.AbstractUnmarshallerImplTests<AbstractUnmarshallerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.AbstractUnmarshallerImpl]

    @Override
    public AbstractUnmarshallerImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.helpers.AbstractUnmarshallerImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.AbstractUnmarshallerImpl]

}
