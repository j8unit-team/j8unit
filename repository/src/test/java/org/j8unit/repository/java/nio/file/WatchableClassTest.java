package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchableClassTest
implements org.j8unit.repository.java.nio.file.WatchableClassTests<java.nio.file.Watchable> {

    @Override
    public Class<java.nio.file.Watchable> createNewSUT() {
        return java.nio.file.Watchable.class;
    }

}
