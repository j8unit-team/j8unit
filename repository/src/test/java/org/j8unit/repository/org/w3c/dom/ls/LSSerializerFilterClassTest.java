package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSSerializerFilterClassTest
implements org.j8unit.repository.org.w3c.dom.ls.LSSerializerFilterClassTests<org.w3c.dom.ls.LSSerializerFilter> {

    @Override
    public Class<org.w3c.dom.ls.LSSerializerFilter> createNewSUT() {
        return org.w3c.dom.ls.LSSerializerFilter.class;
    }

}