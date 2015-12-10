package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextExtClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtClassTests<org.omg.CosNaming.NamingContextExt> {

    @Override
    public Class<org.omg.CosNaming.NamingContextExt> createNewSUT() {
        return org.omg.CosNaming.NamingContextExt.class;
    }

}
