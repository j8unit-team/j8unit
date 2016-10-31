package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.EntityResolver;

@RunWith(J8Unit4.class)
public class EntityResolverClassTest
implements org.j8unit.repository.org.xml.sax.EntityResolverClassTests<EntityResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.EntityResolver]

    @Override
    public Class<EntityResolver> createNewSUT() {
        return EntityResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.EntityResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.EntityResolver]

}
