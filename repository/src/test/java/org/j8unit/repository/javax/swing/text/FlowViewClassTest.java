package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FlowViewClassTest
implements org.j8unit.repository.javax.swing.text.FlowViewClassTests<javax.swing.text.FlowView> {

    @RunWith(J8Unit4.class)
    public static class FlowStrategyClassTest
    implements org.j8unit.repository.javax.swing.text.FlowViewClassTests.FlowStrategyClassTests<javax.swing.text.FlowView.FlowStrategy> {

        @Override
        public Class<javax.swing.text.FlowView.FlowStrategy> createNewSUT() {
            return javax.swing.text.FlowView.FlowStrategy.class;
        }

    }

    @Override
    public Class<javax.swing.text.FlowView> createNewSUT() {
        return javax.swing.text.FlowView.class;
    }

}
