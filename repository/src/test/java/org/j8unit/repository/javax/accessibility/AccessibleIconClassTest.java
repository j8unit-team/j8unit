package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleIcon;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleIconClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleIconClassTests<AccessibleIcon> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleIcon]

    @Override
    public Class<AccessibleIcon> createNewSUT() {
        return AccessibleIcon.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleIcon]

}
