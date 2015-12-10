package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextExtPOAClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtPOAClassTests<org.omg.CosNaming.NamingContextExtPOA> {

    @Override
    public Class<org.omg.CosNaming.NamingContextExtPOA> createNewSUT() {
        return org.omg.CosNaming.NamingContextExtPOA.class;
    }

}
