package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileDescriptorClassTest
implements org.j8unit.repository.java.io.FileDescriptorClassTests<java.io.FileDescriptor> {

    @Override
    public Class<java.io.FileDescriptor> createNewSUT() {
        return java.io.FileDescriptor.class;
    }

}
