package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicAttributesClassTest
implements org.j8unit.repository.javax.naming.directory.BasicAttributesClassTests<javax.naming.directory.BasicAttributes> {

    @Override
    public Class<javax.naming.directory.BasicAttributes> createNewSUT() {
        return javax.naming.directory.BasicAttributes.class;
    }

}
