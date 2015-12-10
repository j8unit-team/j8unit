package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileAttributeViewClassTest
implements org.j8unit.repository.java.nio.file.attribute.FileAttributeViewClassTests<java.nio.file.attribute.FileAttributeView> {

    @Override
    public Class<java.nio.file.attribute.FileAttributeView> createNewSUT() {
        return java.nio.file.attribute.FileAttributeView.class;
    }

}
