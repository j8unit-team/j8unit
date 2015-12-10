package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSResourceResolverClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSResourceResolverClassTests<org.w3c.dom.ls.LSResourceResolver> {

    @Override
    public Class<org.w3c.dom.ls.LSResourceResolver> createNewSUT() {
        return org.w3c.dom.ls.LSResourceResolver.class;
    }

}
