package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSeqClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidSeqClassTests<org.omg.CORBA.DynAnyPackage.InvalidSeq> {

    @Override
    public Class<org.omg.CORBA.DynAnyPackage.InvalidSeq> createNewSUT() {
        return org.omg.CORBA.DynAnyPackage.InvalidSeq.class;
    }

}
