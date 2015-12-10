package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextPOAClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPOAClassTests<org.omg.CosNaming.NamingContextPOA> {

    @Override
    public Class<org.omg.CosNaming.NamingContextPOA> createNewSUT() {
        return org.omg.CosNaming.NamingContextPOA.class;
    }

}
