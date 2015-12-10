package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CustomValueClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.CustomValueClassTests<org.omg.CORBA.portable.CustomValue> {

    @Override
    public Class<org.omg.CORBA.portable.CustomValue> createNewSUT() {
        return org.omg.CORBA.portable.CustomValue.class;
    }

}
