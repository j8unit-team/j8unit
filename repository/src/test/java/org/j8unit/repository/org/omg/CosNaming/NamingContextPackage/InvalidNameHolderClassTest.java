package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidNameHolderClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.InvalidNameHolderClassTests<org.omg.CosNaming.NamingContextPackage.InvalidNameHolder> {

    @Override
    public Class<org.omg.CosNaming.NamingContextPackage.InvalidNameHolder> createNewSUT() {
        return org.omg.CosNaming.NamingContextPackage.InvalidNameHolder.class;
    }

}
