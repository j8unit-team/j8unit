package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsyncBoxViewClassTest
implements org.j8unit.repository.javax.swing.text.AsyncBoxViewClassTests<javax.swing.text.AsyncBoxView> {

    @RunWith(J8Unit4.class)
    public static class ChildLocatorClassTest
    implements org.j8unit.repository.javax.swing.text.AsyncBoxViewClassTests.ChildLocatorClassTests<javax.swing.text.AsyncBoxView.ChildLocator> {

        @Override
        public Class<javax.swing.text.AsyncBoxView.ChildLocator> createNewSUT() {
            return javax.swing.text.AsyncBoxView.ChildLocator.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ChildStateClassTest
    implements org.j8unit.repository.javax.swing.text.AsyncBoxViewClassTests.ChildStateClassTests<javax.swing.text.AsyncBoxView.ChildState> {

        @Override
        public Class<javax.swing.text.AsyncBoxView.ChildState> createNewSUT() {
            return javax.swing.text.AsyncBoxView.ChildState.class;
        }

    }

    @Override
    public Class<javax.swing.text.AsyncBoxView> createNewSUT() {
        return javax.swing.text.AsyncBoxView.class;
    }

}
