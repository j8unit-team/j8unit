package org.j8unit.repository.javax.accessibility;

import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Unit4;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleStateSetTest
implements org.j8unit.repository.javax.accessibility.AccessibleStateSetTests<javax.accessibility.AccessibleStateSet> {

    @Override
    public javax.accessibility.AccessibleStateSet createNewSUT() {
        return new javax.accessibility.AccessibleStateSet();
    }

    @Category(JavaBug.class)
    @Override
    public void toStringMustReturnNotNull() {
        AccessibleStateSetTests.super.toStringMustReturnNotNull();
    }

}
