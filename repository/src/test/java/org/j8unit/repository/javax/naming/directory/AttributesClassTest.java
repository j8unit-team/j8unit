package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements org.j8unit.repository.javax.naming.directory.AttributesClassTests<javax.naming.directory.Attributes> {

    @Override
    public Class<javax.naming.directory.Attributes> createNewSUT() {
        return javax.naming.directory.Attributes.class;
    }

}
