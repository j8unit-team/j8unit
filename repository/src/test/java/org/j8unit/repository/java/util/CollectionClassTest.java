package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CollectionClassTest
implements org.j8unit.repository.java.util.CollectionClassTests<java.util.Collection> {

    @Override
    public Class<java.util.Collection> createNewSUT() {
        return java.util.Collection.class;
    }

}
