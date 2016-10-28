package org.j8unit.repository.java.util;

import java.util.AbstractCollection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractCollectionClassTest
implements org.j8unit.repository.java.util.AbstractCollectionClassTests<AbstractCollection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractCollection]

    @Override
    public Class<AbstractCollection> createNewSUT() {
        return AbstractCollection.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractCollection]

}
