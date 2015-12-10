package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleClassTests<javax.accessibility.Accessible> {

    @Override
    public Class<javax.accessibility.Accessible> createNewSUT() {
        return javax.accessibility.Accessible.class;
    }

}
