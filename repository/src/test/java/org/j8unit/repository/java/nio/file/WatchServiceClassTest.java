package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchServiceClassTest
implements org.j8unit.repository.java.nio.file.WatchServiceClassTests<java.nio.file.WatchService> {

    @Override
    public Class<java.nio.file.WatchService> createNewSUT() {
        return java.nio.file.WatchService.class;
    }

}
