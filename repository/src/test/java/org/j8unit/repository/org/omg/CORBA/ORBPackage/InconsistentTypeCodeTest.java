package org.j8unit.repository.org.omg.CORBA.ORBPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InconsistentTypeCodeTest
implements org.j8unit.repository.org.omg.CORBA.ORBPackage.InconsistentTypeCodeTests<org.omg.CORBA.ORBPackage.InconsistentTypeCode> {

    @Override
    public org.omg.CORBA.ORBPackage.InconsistentTypeCode createNewSUT() {
        return new org.omg.CORBA.ORBPackage.InconsistentTypeCode();
    }

}
