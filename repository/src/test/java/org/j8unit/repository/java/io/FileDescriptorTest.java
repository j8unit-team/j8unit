package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileDescriptorTest
implements org.j8unit.repository.java.io.FileDescriptorTests<java.io.FileDescriptor> {

    @Override
    public java.io.FileDescriptor createNewSUT() {
        return new java.io.FileDescriptor();
    }

}
