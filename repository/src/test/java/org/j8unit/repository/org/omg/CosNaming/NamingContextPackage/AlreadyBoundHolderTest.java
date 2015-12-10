package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyBoundHolderTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolderTests<org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder> {

    @Override
    public org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder createNewSUT() {
        return new org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder();
    }

}
