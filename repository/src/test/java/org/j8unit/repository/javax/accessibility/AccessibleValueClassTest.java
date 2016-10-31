package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleValueClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleValueClassTests<AccessibleValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleValue]

    @Override
    public Class<AccessibleValue> createNewSUT() {
        return AccessibleValue.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleValue]

}
