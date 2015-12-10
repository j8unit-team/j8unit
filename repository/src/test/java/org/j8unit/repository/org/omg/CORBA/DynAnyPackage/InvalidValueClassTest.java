package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidValueClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidValueClassTests<org.omg.CORBA.DynAnyPackage.InvalidValue> {

    @Override
    public Class<org.omg.CORBA.DynAnyPackage.InvalidValue> createNewSUT() {
        return org.omg.CORBA.DynAnyPackage.InvalidValue.class;
    }

}
