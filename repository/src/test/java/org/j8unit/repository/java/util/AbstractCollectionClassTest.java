package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractCollectionClassTest
implements org.j8unit.repository.java.util.AbstractCollectionClassTests<java.util.AbstractCollection> {

    @Override
    public Class<java.util.AbstractCollection> createNewSUT() {
        return java.util.AbstractCollection.class;
    }

}
