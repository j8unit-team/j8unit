package org.j8unit.repository.java.nio.file;

import java.nio.file.FileStore;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileStoreTest
implements org.j8unit.repository.java.nio.file.FileStoreTests<FileStore> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.FileStore]

    @Override
    public FileStore createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.file.FileStore], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.FileStore]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.FileStore]

}
