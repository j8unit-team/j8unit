package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleKeyBindingClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleKeyBindingClassTests<javax.accessibility.AccessibleKeyBinding> {

    @Override
    public Class<javax.accessibility.AccessibleKeyBinding> createNewSUT() {
        return javax.accessibility.AccessibleKeyBinding.class;
    }

}
