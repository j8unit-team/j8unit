package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleSelectionClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleSelectionClassTests<javax.accessibility.AccessibleSelection> {

    @Override
    public Class<javax.accessibility.AccessibleSelection> createNewSUT() {
        return javax.accessibility.AccessibleSelection.class;
    }

}
