package org.j8unit.repository.java.nio.file;

import java.nio.file.Watchable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchableTest
implements org.j8unit.repository.java.nio.file.WatchableTests<Watchable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.Watchable]

    @Override
    public Watchable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.Watchable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.Watchable]

}
