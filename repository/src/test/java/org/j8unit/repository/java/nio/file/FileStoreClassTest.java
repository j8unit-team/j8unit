package org.j8unit.repository.java.nio.file;

import java.nio.file.FileStore;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FileStore} (by simply reusing the J8Unit
 * test interface {@link FileStoreClassTests}).
 */

@RunWith(J8Unit4.class)
public class FileStoreClassTest
implements FileStoreClassTests<FileStore> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileStore]

    @Override
    public Class<FileStore> createNewSUT() {
        return FileStore.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.FileStore]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileStore]

}
