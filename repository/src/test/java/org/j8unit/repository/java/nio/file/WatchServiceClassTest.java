package org.j8unit.repository.java.nio.file;

import java.nio.file.WatchService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WatchServiceClassTest
implements org.j8unit.repository.java.nio.file.WatchServiceClassTests<WatchService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.WatchService]

    @Override
    public Class<WatchService> createNewSUT() {
        return WatchService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.WatchService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.WatchService]

}
