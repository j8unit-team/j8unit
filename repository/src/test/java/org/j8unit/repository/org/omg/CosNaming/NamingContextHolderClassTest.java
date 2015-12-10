package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingContextHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextHolderClassTests<org.omg.CosNaming.NamingContextHolder> {

    @Override
    public Class<org.omg.CosNaming.NamingContextHolder> createNewSUT() {
        return org.omg.CosNaming.NamingContextHolder.class;
    }

}
