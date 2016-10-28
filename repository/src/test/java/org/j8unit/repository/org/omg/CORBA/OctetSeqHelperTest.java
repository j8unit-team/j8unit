package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.OctetSeqHelper;

@RunWith(J8Unit4.class)
public class OctetSeqHelperTest
implements org.j8unit.repository.org.omg.CORBA.OctetSeqHelperTests<OctetSeqHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.OctetSeqHelper]

    @Override
    public OctetSeqHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.OctetSeqHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.OctetSeqHelper]

}
