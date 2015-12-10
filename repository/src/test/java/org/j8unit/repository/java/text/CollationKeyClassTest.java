package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollationKeyClassTest
implements org.j8unit.repository.java.text.CollationKeyClassTests<java.text.CollationKey> {

    @Override
    public Class<java.text.CollationKey> createNewSUT() {
        return java.text.CollationKey.class;
    }

}
