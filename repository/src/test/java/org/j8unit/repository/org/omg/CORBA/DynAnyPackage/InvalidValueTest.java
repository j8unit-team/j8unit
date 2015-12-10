package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidValueTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidValueTests<org.omg.CORBA.DynAnyPackage.InvalidValue> {

    @Override
    public org.omg.CORBA.DynAnyPackage.InvalidValue createNewSUT() {
        return new org.omg.CORBA.DynAnyPackage.InvalidValue();
    }

}
