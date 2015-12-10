package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModificationItemClassTest
implements org.j8unit.repository.javax.naming.directory.ModificationItemClassTests<javax.naming.directory.ModificationItem> {

    @Override
    public Class<javax.naming.directory.ModificationItem> createNewSUT() {
        return javax.naming.directory.ModificationItem.class;
    }

}
