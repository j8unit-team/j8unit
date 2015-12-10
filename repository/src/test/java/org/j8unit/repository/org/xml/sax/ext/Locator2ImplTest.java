package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Locator2ImplTest
implements org.j8unit.repository.org.xml.sax.ext.Locator2ImplTests<org.xml.sax.ext.Locator2Impl> {

    @Override
    public org.xml.sax.ext.Locator2Impl createNewSUT() {
        return new org.xml.sax.ext.Locator2Impl();
    }

}
