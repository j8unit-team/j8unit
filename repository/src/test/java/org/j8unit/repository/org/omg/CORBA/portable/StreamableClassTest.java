package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamableClassTest
implements org.j8unit.repository.org.omg.CORBA.portable.StreamableClassTests<org.omg.CORBA.portable.Streamable> {

    @Override
    public Class<org.omg.CORBA.portable.Streamable> createNewSUT() {
        return org.omg.CORBA.portable.Streamable.class;
    }

}
