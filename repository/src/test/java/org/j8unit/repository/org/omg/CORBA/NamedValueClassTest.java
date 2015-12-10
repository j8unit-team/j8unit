package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamedValueClassTest
implements org.j8unit.repository.org.omg.CORBA.NamedValueClassTests<org.omg.CORBA.NamedValue> {

    @Override
    public Class<org.omg.CORBA.NamedValue> createNewSUT() {
        return org.omg.CORBA.NamedValue.class;
    }

}
