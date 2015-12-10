package org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieHolderTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage.CookieHolderTests<org.omg.PortableServer.ServantLocatorPackage.CookieHolder> {

    @Override
    public org.omg.PortableServer.ServantLocatorPackage.CookieHolder createNewSUT() {
        return new org.omg.PortableServer.ServantLocatorPackage.CookieHolder();
    }

}
