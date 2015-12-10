package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicAttributeClassTest
implements org.j8unit.repository.javax.naming.directory.BasicAttributeClassTests<javax.naming.directory.BasicAttribute> {

    @Override
    public Class<javax.naming.directory.BasicAttribute> createNewSUT() {
        return javax.naming.directory.BasicAttribute.class;
    }

}
