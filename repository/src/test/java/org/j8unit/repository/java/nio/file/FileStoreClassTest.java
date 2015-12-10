package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileStoreClassTest
implements org.j8unit.repository.java.nio.file.FileStoreClassTests<java.nio.file.FileStore> {

    @Override
    public Class<java.nio.file.FileStore> createNewSUT() {
        return java.nio.file.FileStore.class;
    }

}
