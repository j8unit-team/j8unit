package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EntityResolverClassTest
implements org.j8unit.repository.org.xml.sax.EntityResolverClassTests<org.xml.sax.EntityResolver> {

    @Override
    public Class<org.xml.sax.EntityResolver> createNewSUT() {
        return org.xml.sax.EntityResolver.class;
    }

}
