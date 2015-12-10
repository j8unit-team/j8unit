package org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAddressClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage.InvalidAddressClassTests<org.omg.CosNaming.NamingContextExtPackage.InvalidAddress> {

    @Override
    public Class<org.omg.CosNaming.NamingContextExtPackage.InvalidAddress> createNewSUT() {
        return org.omg.CosNaming.NamingContextExtPackage.InvalidAddress.class;
    }

}
