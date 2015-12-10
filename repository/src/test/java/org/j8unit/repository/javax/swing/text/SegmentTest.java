package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SegmentTest
implements org.j8unit.repository.javax.swing.text.SegmentTests<javax.swing.text.Segment> {

    @Override
    public javax.swing.text.Segment createNewSUT() {
        return new javax.swing.text.Segment();
    }

}
