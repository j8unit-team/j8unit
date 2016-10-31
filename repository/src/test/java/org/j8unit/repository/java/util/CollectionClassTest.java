package org.j8unit.repository.java.util;

import java.util.Collection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CollectionClassTest
implements org.j8unit.repository.java.util.CollectionClassTests<Collection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Collection]

    @Override
    public Class<Collection> createNewSUT() {
        return Collection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Collection]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Collection]

}
