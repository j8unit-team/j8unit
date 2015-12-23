package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SwingWorkerClassTest
implements org.j8unit.repository.javax.swing.SwingWorkerClassTests<javax.swing.SwingWorker> {

    @Override
    public Class<javax.swing.SwingWorker> createNewSUT() {
        return javax.swing.SwingWorker.class;
    }

    @RunWith(J8Unit4.class)
    public static class StateValueClassTest
    implements org.j8unit.repository.javax.swing.SwingWorkerClassTests.StateValueClassTests<javax.swing.SwingWorker.StateValue> {

        @Override
        public Class<javax.swing.SwingWorker.StateValue> createNewSUT() {
            return javax.swing.SwingWorker.StateValue.class;
        }

    }

}
