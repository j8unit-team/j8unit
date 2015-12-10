package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HashAttributeSetTest
implements org.j8unit.repository.javax.print.attribute.HashAttributeSetTests<javax.print.attribute.HashAttributeSet> {

    @Override
    public javax.print.attribute.HashAttributeSet createNewSUT() {
        return new javax.print.attribute.HashAttributeSet();
    }

}
