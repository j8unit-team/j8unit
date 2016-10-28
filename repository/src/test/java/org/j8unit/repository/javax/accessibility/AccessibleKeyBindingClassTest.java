package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleKeyBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleKeyBindingClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleKeyBindingClassTests<AccessibleKeyBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleKeyBinding]

    @Override
    public Class<AccessibleKeyBinding> createNewSUT() {
        return AccessibleKeyBinding.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleKeyBinding]

}
