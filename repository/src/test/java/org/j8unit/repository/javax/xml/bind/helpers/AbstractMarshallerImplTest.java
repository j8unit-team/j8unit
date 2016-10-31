package org.j8unit.repository.javax.xml.bind.helpers;

import javax.xml.bind.helpers.AbstractMarshallerImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractMarshallerImplTest
implements org.j8unit.repository.javax.xml.bind.helpers.AbstractMarshallerImplTests<AbstractMarshallerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.helpers.AbstractMarshallerImpl]

    @Override
    public AbstractMarshallerImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.helpers.AbstractMarshallerImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.helpers.AbstractMarshallerImpl]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.helpers.AbstractMarshallerImpl]

}
