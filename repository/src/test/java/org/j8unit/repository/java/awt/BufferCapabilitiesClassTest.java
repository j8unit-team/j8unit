package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BufferCapabilitiesClassTest
implements org.j8unit.repository.java.awt.BufferCapabilitiesClassTests<java.awt.BufferCapabilities> {

    @Override
    public Class<java.awt.BufferCapabilities> createNewSUT() {
        return java.awt.BufferCapabilities.class;
    }

    @RunWith(J8Unit4.class)
    public static class FlipContentsClassTest
    implements org.j8unit.repository.java.awt.BufferCapabilitiesClassTests.FlipContentsClassTests<java.awt.BufferCapabilities.FlipContents> {

        @Override
        public Class<java.awt.BufferCapabilities.FlipContents> createNewSUT() {
            return java.awt.BufferCapabilities.FlipContents.class;
        }

    }

}
