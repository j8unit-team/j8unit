package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleComponentClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleComponentClassTests<javax.accessibility.AccessibleComponent> {

    @Override
    public Class<javax.accessibility.AccessibleComponent> createNewSUT() {
        return javax.accessibility.AccessibleComponent.class;
    }

}
