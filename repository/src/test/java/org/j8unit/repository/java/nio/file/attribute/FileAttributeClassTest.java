package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class FileAttributeClassTest
implements org.j8unit.repository.java.nio.file.attribute.FileAttributeClassTests<java.nio.file.attribute.FileAttribute> {

    @Override
    public Class<java.nio.file.attribute.FileAttribute> createNewSUT() {
        return java.nio.file.attribute.FileAttribute.class;
    }

}
