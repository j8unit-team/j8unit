package org.j8unit.repository.org.omg.CORBA.ORBPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InconsistentTypeCodeClassTest
implements org.j8unit.repository.org.omg.CORBA.ORBPackage.InconsistentTypeCodeClassTests<org.omg.CORBA.ORBPackage.InconsistentTypeCode> {

    @Override
    public Class<org.omg.CORBA.ORBPackage.InconsistentTypeCode> createNewSUT() {
        return org.omg.CORBA.ORBPackage.InconsistentTypeCode.class;
    }

}
