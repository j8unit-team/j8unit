package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileStoreAttributeViewClassTest
implements org.j8unit.repository.java.nio.file.attribute.FileStoreAttributeViewClassTests<java.nio.file.attribute.FileStoreAttributeView> {

    @Override
    public Class<java.nio.file.attribute.FileStoreAttributeView> createNewSUT() {
        return java.nio.file.attribute.FileStoreAttributeView.class;
    }

}
