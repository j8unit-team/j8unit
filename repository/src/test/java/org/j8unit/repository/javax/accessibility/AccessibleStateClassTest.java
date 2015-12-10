package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleStateClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleStateClassTests<javax.accessibility.AccessibleState> {

    @Override
    public Class<javax.accessibility.AccessibleState> createNewSUT() {
        return javax.accessibility.AccessibleState.class;
    }

}
