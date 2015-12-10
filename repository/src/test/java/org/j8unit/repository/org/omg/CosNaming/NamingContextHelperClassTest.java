package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextHelperClassTests<org.omg.CosNaming.NamingContextHelper> {

    @Override
    public Class<org.omg.CosNaming.NamingContextHelper> createNewSUT() {
        return org.omg.CosNaming.NamingContextHelper.class;
    }

}
