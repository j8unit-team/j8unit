package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSeqTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidSeqTests<org.omg.CORBA.DynAnyPackage.InvalidSeq> {

    @Override
    public org.omg.CORBA.DynAnyPackage.InvalidSeq createNewSUT() {
        return new org.omg.CORBA.DynAnyPackage.InvalidSeq();
    }

}
