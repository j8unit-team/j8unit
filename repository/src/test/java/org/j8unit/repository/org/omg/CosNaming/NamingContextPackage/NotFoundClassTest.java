package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotFoundClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundClassTests<org.omg.CosNaming.NamingContextPackage.NotFound> {

    @Override
    public Class<org.omg.CosNaming.NamingContextPackage.NotFound> createNewSUT() {
        return org.omg.CosNaming.NamingContextPackage.NotFound.class;
    }

}