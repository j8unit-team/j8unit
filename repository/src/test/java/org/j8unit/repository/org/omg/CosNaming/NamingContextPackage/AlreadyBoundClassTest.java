package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyBoundClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.AlreadyBoundClassTests<org.omg.CosNaming.NamingContextPackage.AlreadyBound> {

    @Override
    public Class<org.omg.CosNaming.NamingContextPackage.AlreadyBound> createNewSUT() {
        return org.omg.CosNaming.NamingContextPackage.AlreadyBound.class;
    }

}