package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaTrackerClassTest
implements org.j8unit.repository.java.awt.MediaTrackerClassTests<java.awt.MediaTracker> {

    @Override
    public Class<java.awt.MediaTracker> createNewSUT() {
        return java.awt.MediaTracker.class;
    }

}
