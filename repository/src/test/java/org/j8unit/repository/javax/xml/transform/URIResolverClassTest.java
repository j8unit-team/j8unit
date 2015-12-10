package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIResolverClassTest
implements org.j8unit.repository.javax.xml.transform.URIResolverClassTests<javax.xml.transform.URIResolver> {

    @Override
    public Class<javax.xml.transform.URIResolver> createNewSUT() {
        return javax.xml.transform.URIResolver.class;
    }

}
