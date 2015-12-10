package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextHolderTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextHolderTests<org.omg.CosNaming.NamingContextHolder> {

    @Override
    public org.omg.CosNaming.NamingContextHolder createNewSUT() {
        return new org.omg.CosNaming.NamingContextHolder();
    }

}
