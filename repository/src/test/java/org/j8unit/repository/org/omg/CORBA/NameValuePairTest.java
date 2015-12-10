package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameValuePairTest
implements org.j8unit.repository.org.omg.CORBA.NameValuePairTests<org.omg.CORBA.NameValuePair> {

    @Override
    public org.omg.CORBA.NameValuePair createNewSUT() {
        return new org.omg.CORBA.NameValuePair();
    }

}
