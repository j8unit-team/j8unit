package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OutputStreamClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.OutputStreamClassTests<org.omg.CORBA.portable.OutputStream> {

    @Override
    public Class<org.omg.CORBA.portable.OutputStream> createNewSUT() {
        return org.omg.CORBA.portable.OutputStream.class;
    }

}
