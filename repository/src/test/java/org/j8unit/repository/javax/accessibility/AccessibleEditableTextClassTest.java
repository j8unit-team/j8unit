package org.j8unit.repository.javax.accessibility;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleEditableTextClassTest
implements org.j8unit.repository.javax.accessibility.AccessibleEditableTextClassTests<javax.accessibility.AccessibleEditableText> {

    @Override
    public Class<javax.accessibility.AccessibleEditableText> createNewSUT() {
        return javax.accessibility.AccessibleEditableText.class;
    }

}
