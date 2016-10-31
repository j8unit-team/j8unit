package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleTable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleTableClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleTableClassTests<AccessibleTable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleTable]

    @Override
    public Class<AccessibleTable> createNewSUT() {
        return AccessibleTable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleTable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleTable]

}
