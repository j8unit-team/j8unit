package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadKindTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodePackage.BadKindTests<org.omg.CORBA.TypeCodePackage.BadKind> {

    @Override
    public org.omg.CORBA.TypeCodePackage.BadKind createNewSUT() {
        return new org.omg.CORBA.TypeCodePackage.BadKind();
    }

}
