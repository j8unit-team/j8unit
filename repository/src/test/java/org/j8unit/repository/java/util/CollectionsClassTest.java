package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollectionsClassTest
implements org.j8unit.repository.java.util.CollectionsClassTests<java.util.Collections> {

    @Override
    public Class<java.util.Collections> createNewSUT() {
        return java.util.Collections.class;
    }

}
