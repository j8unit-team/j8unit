package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CORBA.VersionSpecHelper;

@RunWith(J8Unit4.class)
public class VersionSpecHelperTest
implements org.j8unit.repository.org.omg.CORBA.VersionSpecHelperTests<VersionSpecHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VersionSpecHelper]

    @Override
    public VersionSpecHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CORBA.VersionSpecHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.VersionSpecHelper]

}
