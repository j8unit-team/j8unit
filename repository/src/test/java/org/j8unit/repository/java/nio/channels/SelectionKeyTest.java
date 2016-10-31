package org.j8unit.repository.java.nio.channels;

import java.nio.channels.SelectionKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SelectionKeyTest
implements org.j8unit.repository.java.nio.channels.SelectionKeyTests<SelectionKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.SelectionKey]

    @Override
    public SelectionKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.SelectionKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.SelectionKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.SelectionKey]

}
