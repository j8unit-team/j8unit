package org.j8unit.repository.javax.accessibility;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.accessibility.AccessibleState;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class AccessibleStateTest
implements org.j8unit.repository.javax.accessibility.AccessibleStateTests<AccessibleState> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleState]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AccessibleState.BUSY, //
                                AccessibleState.FOCUSABLE, //
                                AccessibleState.INDETERMINATE, //
                                AccessibleState.ARMED, //
                                AccessibleState.SHOWING, //
                                AccessibleState.EXPANDABLE, //
                                AccessibleState.MODAL, //
                                AccessibleState.ICONIFIED, //
                                AccessibleState.RESIZABLE, //
                                AccessibleState.SELECTABLE, //
                                AccessibleState.MULTISELECTABLE, //
                                AccessibleState.EXPANDED, //
                                AccessibleState.OPAQUE, //
                                AccessibleState.SELECTED, //
                                AccessibleState.TRUNCATED, //
                                AccessibleState.MULTI_LINE, //
                                AccessibleState.TRANSIENT, //
                                AccessibleState.ENABLED, //
                                AccessibleState.HORIZONTAL, //
                                AccessibleState.ACTIVE, //
                                AccessibleState.VISIBLE, //
                                AccessibleState.EDITABLE, //
                                AccessibleState.FOCUSED, //
                                AccessibleState.CHECKED, //
                                AccessibleState.MANAGES_DESCENDANTS, //
                                AccessibleState.VERTICAL, //
                                AccessibleState.PRESSED, //
                                AccessibleState.SINGLE_LINE, //
                                AccessibleState.COLLAPSED);
    }

    @Parameter(0)
    public AccessibleState sut;

    @Override
    public AccessibleState createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleState]

}
