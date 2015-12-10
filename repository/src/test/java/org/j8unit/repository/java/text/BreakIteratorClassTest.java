package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BreakIteratorClassTest
implements org.j8unit.repository.java.text.BreakIteratorClassTests<java.text.BreakIterator> {

    @Override
    public Class<java.text.BreakIterator> createNewSUT() {
        return java.text.BreakIterator.class;
    }

}
