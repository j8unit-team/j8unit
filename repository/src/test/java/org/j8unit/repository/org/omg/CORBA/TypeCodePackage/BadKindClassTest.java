package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadKindClassTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodePackage.BadKindClassTests<org.omg.CORBA.TypeCodePackage.BadKind> {

    @Override
    public Class<org.omg.CORBA.TypeCodePackage.BadKind> createNewSUT() {
        return org.omg.CORBA.TypeCodePackage.BadKind.class;
    }

}
