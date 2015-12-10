package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleTableClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleTableClassTests<javax.accessibility.AccessibleTable> {

    @Override
    public Class<javax.accessibility.AccessibleTable> createNewSUT() {
        return javax.accessibility.AccessibleTable.class;
    }

}
