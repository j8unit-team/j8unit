package org.j8unit.repository.java.nio.file;

import java.nio.file.FileStore;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileStoreClassTest
implements org.j8unit.repository.java.nio.file.FileStoreClassTests<FileStore> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.FileStore]

    @Override
    public Class<FileStore> createNewSUT() {
        return FileStore.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.FileStore]

}
