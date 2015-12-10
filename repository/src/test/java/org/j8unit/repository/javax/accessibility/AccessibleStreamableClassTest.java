package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleStreamableClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleStreamableClassTests<javax.accessibility.AccessibleStreamable> {

    @Override
    public Class<javax.accessibility.AccessibleStreamable> createNewSUT() {
        return javax.accessibility.AccessibleStreamable.class;
    }

}
