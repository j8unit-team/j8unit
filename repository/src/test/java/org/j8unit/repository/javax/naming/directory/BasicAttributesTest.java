package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicAttributesTest
implements org.j8unit.repository.javax.naming.directory.BasicAttributesTests<javax.naming.directory.BasicAttributes> {

    @Override
    public javax.naming.directory.BasicAttributes createNewSUT() {
        return new javax.naming.directory.BasicAttributes();
    }

}
