package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputStreamClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.InputStreamClassTests<org.omg.CORBA.portable.InputStream> {

    @Override
    public Class<org.omg.CORBA.portable.InputStream> createNewSUT() {
        return org.omg.CORBA.portable.InputStream.class;
    }

}
