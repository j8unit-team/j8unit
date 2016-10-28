package org.j8unit.repository.java.nio.file;

import java.nio.file.Watchable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchableClassTest
implements org.j8unit.repository.java.nio.file.WatchableClassTests<Watchable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.Watchable]

    @Override
    public Class<Watchable> createNewSUT() {
        return Watchable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.Watchable]

}
