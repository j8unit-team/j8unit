package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextClassTests<org.omg.CosNaming.NamingContext> {

    @Override
    public Class<org.omg.CosNaming.NamingContext> createNewSUT() {
        return org.omg.CosNaming.NamingContext.class;
    }

}
