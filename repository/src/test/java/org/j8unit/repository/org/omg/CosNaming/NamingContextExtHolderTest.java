package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextExtHolderTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtHolderTests<org.omg.CosNaming.NamingContextExtHolder> {

    @Override
    public org.omg.CosNaming.NamingContextExtHolder createNewSUT() {
        return new org.omg.CosNaming.NamingContextExtHolder();
    }

}
