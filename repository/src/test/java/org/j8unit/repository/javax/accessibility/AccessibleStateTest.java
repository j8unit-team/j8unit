package org.j8unit.repository.javax.accessibility;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccessibleStateTest
implements org.j8unit.repository.javax.accessibility.AccessibleStateTests<javax.accessibility.AccessibleState> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.accessibility.AccessibleState.BUSY, //
                                javax.accessibility.AccessibleState.FOCUSABLE, //
                                javax.accessibility.AccessibleState.INDETERMINATE, //
                                javax.accessibility.AccessibleState.ARMED, //
                                javax.accessibility.AccessibleState.SHOWING, //
                                javax.accessibility.AccessibleState.EXPANDABLE, //
                                javax.accessibility.AccessibleState.MODAL, //
                                javax.accessibility.AccessibleState.ICONIFIED, //
                                javax.accessibility.AccessibleState.RESIZABLE, //
                                javax.accessibility.AccessibleState.SELECTABLE, //
                                javax.accessibility.AccessibleState.MULTISELECTABLE, //
                                javax.accessibility.AccessibleState.EXPANDED, //
                                javax.accessibility.AccessibleState.OPAQUE, //
                                javax.accessibility.AccessibleState.SELECTED, //
                                javax.accessibility.AccessibleState.TRUNCATED, //
                                javax.accessibility.AccessibleState.MULTI_LINE, //
                                javax.accessibility.AccessibleState.TRANSIENT, //
                                javax.accessibility.AccessibleState.ENABLED, //
                                javax.accessibility.AccessibleState.HORIZONTAL, //
                                javax.accessibility.AccessibleState.ACTIVE, //
                                javax.accessibility.AccessibleState.VISIBLE, //
                                javax.accessibility.AccessibleState.EDITABLE, //
                                javax.accessibility.AccessibleState.FOCUSED, //
                                javax.accessibility.AccessibleState.CHECKED, //
                                javax.accessibility.AccessibleState.MANAGES_DESCENDANTS, //
                                javax.accessibility.AccessibleState.VERTICAL, //
                                javax.accessibility.AccessibleState.PRESSED, //
                                javax.accessibility.AccessibleState.SINGLE_LINE, //
                                javax.accessibility.AccessibleState.COLLAPSED);
    }

    @Parameter(0)
    public javax.accessibility.AccessibleState sut;

    @Override
    public javax.accessibility.AccessibleState createNewSUT() {
        return this.sut;
    }

}
