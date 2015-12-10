package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameValuePairClassTest
implements org.j8unit.repository.org.omg.CORBA.NameValuePairClassTests<org.omg.CORBA.NameValuePair> {

    @Override
    public Class<org.omg.CORBA.NameValuePair> createNewSUT() {
        return org.omg.CORBA.NameValuePair.class;
    }

}
