package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleContextClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleContextClassTests<javax.accessibility.AccessibleContext> {

    @Override
    public Class<javax.accessibility.AccessibleContext> createNewSUT() {
        return javax.accessibility.AccessibleContext.class;
    }

}
