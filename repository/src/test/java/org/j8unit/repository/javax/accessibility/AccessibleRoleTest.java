package org.j8unit.repository.javax.accessibility;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.accessibility.AccessibleRole;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleRole} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleRoleTests}).
 */
@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccessibleRoleTest
implements AccessibleRoleTests<AccessibleRole> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleRole]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(AccessibleRole.COLUMN_HEADER, //
                                AccessibleRole.ICON, //
                                AccessibleRole.PAGE_TAB_LIST, //
                                AccessibleRole.VIEWPORT, //
                                AccessibleRole.COLOR_CHOOSER, //
                                AccessibleRole.SPIN_BOX, //
                                AccessibleRole.ROW_HEADER, //
                                AccessibleRole.INTERNAL_FRAME, //
                                AccessibleRole.LAYERED_PANE, //
                                AccessibleRole.CANVAS, //
                                AccessibleRole.TOOL_BAR, //
                                AccessibleRole.HEADER, //
                                AccessibleRole.DESKTOP_PANE, //
                                AccessibleRole.FRAME, //
                                AccessibleRole.TOOL_TIP, //
                                AccessibleRole.HTML_CONTAINER, //
                                AccessibleRole.OPTION_PANE, //
                                AccessibleRole.MENU, //
                                AccessibleRole.UNKNOWN, //
                                AccessibleRole.TOGGLE_BUTTON, //
                                AccessibleRole.RULER, //
                                AccessibleRole.POPUP_MENU, //
                                AccessibleRole.SCROLL_BAR, //
                                AccessibleRole.RADIO_BUTTON, //
                                AccessibleRole.LIST_ITEM, //
                                AccessibleRole.FILLER, //
                                AccessibleRole.FOOTER, //
                                AccessibleRole.EDITBAR, //
                                AccessibleRole.SWING_COMPONENT, //
                                AccessibleRole.GLASS_PANE, //
                                AccessibleRole.WINDOW, //
                                AccessibleRole.FILE_CHOOSER, //
                                AccessibleRole.DIRECTORY_PANE, //
                                AccessibleRole.STATUS_BAR, //
                                AccessibleRole.PANEL, //
                                AccessibleRole.DIALOG, //
                                AccessibleRole.SPLIT_PANE, //
                                AccessibleRole.HYPERLINK, //
                                AccessibleRole.LABEL, //
                                AccessibleRole.PROGRESS_BAR, //
                                AccessibleRole.SLIDER, //
                                AccessibleRole.COMBO_BOX, //
                                AccessibleRole.TABLE, //
                                AccessibleRole.PROGRESS_MONITOR, //
                                AccessibleRole.ALERT, //
                                AccessibleRole.TEXT, //
                                AccessibleRole.PARAGRAPH, //
                                AccessibleRole.ROOT_PANE, //
                                AccessibleRole.GROUP_BOX, //
                                AccessibleRole.FONT_CHOOSER, //
                                AccessibleRole.DATE_EDITOR, //
                                AccessibleRole.PASSWORD_TEXT, //
                                AccessibleRole.CHECK_BOX, //
                                AccessibleRole.TREE, //
                                AccessibleRole.LIST, //
                                AccessibleRole.PUSH_BUTTON, //
                                AccessibleRole.PAGE_TAB, //
                                AccessibleRole.SCROLL_PANE, //
                                AccessibleRole.AWT_COMPONENT, //
                                AccessibleRole.MENU_BAR, //
                                AccessibleRole.DESKTOP_ICON, //
                                AccessibleRole.MENU_ITEM, //
                                AccessibleRole.SEPARATOR);
    }

    @Parameter(0)
    public AccessibleRole sut;

    @Override
    public AccessibleRole createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleRole]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleRole]

}
