package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextExtHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtHolderClassTests<org.omg.CosNaming.NamingContextExtHolder> {

    @Override
    public Class<org.omg.CosNaming.NamingContextExtHolder> createNewSUT() {
        return org.omg.CosNaming.NamingContextExtHolder.class;
    }

}
