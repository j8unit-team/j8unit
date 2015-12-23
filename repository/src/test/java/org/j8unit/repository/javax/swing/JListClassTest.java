package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class JListClassTest
implements org.j8unit.repository.javax.swing.JListClassTests<javax.swing.JList> {

    @Override
    public Class<javax.swing.JList> createNewSUT() {
        return javax.swing.JList.class;
    }

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.JListClassTests.DropLocationClassTests<javax.swing.JList.DropLocation> {

        @Override
        public Class<javax.swing.JList.DropLocation> createNewSUT() {
            return javax.swing.JList.DropLocation.class;
        }

    }

}
