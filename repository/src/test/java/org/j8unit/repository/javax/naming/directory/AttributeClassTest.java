package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeClassTest
implements org.j8unit.repository.javax.naming.directory.AttributeClassTests<javax.naming.directory.Attribute> {

    @Override
    public Class<javax.naming.directory.Attribute> createNewSUT() {
        return javax.naming.directory.Attribute.class;
    }

}