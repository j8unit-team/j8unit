package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleValueClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleValueClassTests<javax.accessibility.AccessibleValue> {

    @Override
    public Class<javax.accessibility.AccessibleValue> createNewSUT() {
        return javax.accessibility.AccessibleValue.class;
    }

}
