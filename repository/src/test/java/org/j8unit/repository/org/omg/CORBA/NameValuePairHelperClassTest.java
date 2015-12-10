package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameValuePairHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.NameValuePairHelperClassTests<org.omg.CORBA.NameValuePairHelper> {

    @Override
    public Class<org.omg.CORBA.NameValuePairHelper> createNewSUT() {
        return org.omg.CORBA.NameValuePairHelper.class;
    }

}
