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
public class AccessibleRoleTest
implements org.j8unit.repository.javax.accessibility.AccessibleRoleTests<javax.accessibility.AccessibleRole> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.accessibility.AccessibleRole.COLUMN_HEADER, //
                                javax.accessibility.AccessibleRole.ICON, //
                                javax.accessibility.AccessibleRole.PAGE_TAB_LIST, //
                                javax.accessibility.AccessibleRole.VIEWPORT, //
                                javax.accessibility.AccessibleRole.COLOR_CHOOSER, //
                                javax.accessibility.AccessibleRole.SPIN_BOX, //
                                javax.accessibility.AccessibleRole.ROW_HEADER, //
                                javax.accessibility.AccessibleRole.INTERNAL_FRAME, //
                                javax.accessibility.AccessibleRole.LAYERED_PANE, //
                                javax.accessibility.AccessibleRole.CANVAS, //
                                javax.accessibility.AccessibleRole.TOOL_BAR, //
                                javax.accessibility.AccessibleRole.HEADER, //
                                javax.accessibility.AccessibleRole.DESKTOP_PANE, //
                                javax.accessibility.AccessibleRole.FRAME, //
                                javax.accessibility.AccessibleRole.TOOL_TIP, //
                                javax.accessibility.AccessibleRole.HTML_CONTAINER, //
                                javax.accessibility.AccessibleRole.OPTION_PANE, //
                                javax.accessibility.AccessibleRole.MENU, //
                                javax.accessibility.AccessibleRole.UNKNOWN, //
                                javax.accessibility.AccessibleRole.TOGGLE_BUTTON, //
                                javax.accessibility.AccessibleRole.RULER, //
                                javax.accessibility.AccessibleRole.POPUP_MENU, //
                                javax.accessibility.AccessibleRole.SCROLL_BAR, //
                                javax.accessibility.AccessibleRole.RADIO_BUTTON, //
                                javax.accessibility.AccessibleRole.LIST_ITEM, //
                                javax.accessibility.AccessibleRole.FILLER, //
                                javax.accessibility.AccessibleRole.FOOTER, //
                                javax.accessibility.AccessibleRole.EDITBAR, //
                                javax.accessibility.AccessibleRole.SWING_COMPONENT, //
                                javax.accessibility.AccessibleRole.GLASS_PANE, //
                                javax.accessibility.AccessibleRole.WINDOW, //
                                javax.accessibility.AccessibleRole.FILE_CHOOSER, //
                                javax.accessibility.AccessibleRole.DIRECTORY_PANE, //
                                javax.accessibility.AccessibleRole.STATUS_BAR, //
                                javax.accessibility.AccessibleRole.PANEL, //
                                javax.accessibility.AccessibleRole.DIALOG, //
                                javax.accessibility.AccessibleRole.SPLIT_PANE, //
                                javax.accessibility.AccessibleRole.HYPERLINK, //
                                javax.accessibility.AccessibleRole.LABEL, //
                                javax.accessibility.AccessibleRole.PROGRESS_BAR, //
                                javax.accessibility.AccessibleRole.SLIDER, //
                                javax.accessibility.AccessibleRole.COMBO_BOX, //
                                javax.accessibility.AccessibleRole.TABLE, //
                                javax.accessibility.AccessibleRole.PROGRESS_MONITOR, //
                                javax.accessibility.AccessibleRole.ALERT, //
                                javax.accessibility.AccessibleRole.TEXT, //
                                javax.accessibility.AccessibleRole.PARAGRAPH, //
                                javax.accessibility.AccessibleRole.ROOT_PANE, //
                                javax.accessibility.AccessibleRole.GROUP_BOX, //
                                javax.accessibility.AccessibleRole.FONT_CHOOSER, //
                                javax.accessibility.AccessibleRole.DATE_EDITOR, //
                                javax.accessibility.AccessibleRole.PASSWORD_TEXT, //
                                javax.accessibility.AccessibleRole.CHECK_BOX, //
                                javax.accessibility.AccessibleRole.TREE, //
                                javax.accessibility.AccessibleRole.LIST, //
                                javax.accessibility.AccessibleRole.PUSH_BUTTON, //
                                javax.accessibility.AccessibleRole.PAGE_TAB, //
                                javax.accessibility.AccessibleRole.SCROLL_PANE, //
                                javax.accessibility.AccessibleRole.AWT_COMPONENT, //
                                javax.accessibility.AccessibleRole.MENU_BAR, //
                                javax.accessibility.AccessibleRole.DESKTOP_ICON, //
                                javax.accessibility.AccessibleRole.MENU_ITEM, //
                                javax.accessibility.AccessibleRole.SEPARATOR);
    }

    @Parameter(0)
    public javax.accessibility.AccessibleRole sut;

    @Override
    public javax.accessibility.AccessibleRole createNewSUT() {
        return this.sut;
    }

}
