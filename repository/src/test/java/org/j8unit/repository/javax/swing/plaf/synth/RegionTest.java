package org.j8unit.repository.javax.swing.plaf.synth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.swing.plaf.synth.Region;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Region} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.plaf.synth.RegionTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RegionTest
implements RegionTests<Region> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.synth.Region]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(Region.TABBED_PANE, //
                                Region.FORMATTED_TEXT_FIELD, //
                                Region.DESKTOP_ICON, //
                                Region.SLIDER_TRACK, //
                                Region.SEPARATOR, //
                                Region.TEXT_AREA, //
                                Region.ARROW_BUTTON, //
                                Region.MENU_ITEM, //
                                Region.POPUP_MENU_SEPARATOR, //
                                Region.MENU_ITEM_ACCELERATOR, //
                                Region.SPINNER, //
                                Region.SCROLL_PANE, //
                                Region.MENU_BAR, //
                                Region.CHECK_BOX_MENU_ITEM, //
                                Region.TABBED_PANE_TAB_AREA, //
                                Region.SLIDER_THUMB, //
                                Region.CHECK_BOX, //
                                Region.TREE, //
                                Region.TEXT_PANE, //
                                Region.TABLE_HEADER, //
                                Region.LIST, //
                                Region.TOOL_BAR_CONTENT, //
                                Region.ROOT_PANE, //
                                Region.COMBO_BOX, //
                                Region.TABLE, //
                                Region.SLIDER, //
                                Region.RADIO_BUTTON_MENU_ITEM, //
                                Region.INTERNAL_FRAME_TITLE_PANE, //
                                Region.TOOL_BAR_SEPARATOR, //
                                Region.LABEL, //
                                Region.PROGRESS_BAR, //
                                Region.EDITOR_PANE, //
                                Region.PANEL, //
                                Region.TABBED_PANE_TAB, //
                                Region.SPLIT_PANE, //
                                Region.SCROLL_BAR_TRACK, //
                                Region.TABBED_PANE_CONTENT, //
                                Region.FILE_CHOOSER, //
                                Region.PASSWORD_FIELD, //
                                Region.POPUP_MENU, //
                                Region.SCROLL_BAR, //
                                Region.SPLIT_PANE_DIVIDER, //
                                Region.RADIO_BUTTON, //
                                Region.MENU, //
                                Region.SCROLL_BAR_THUMB, //
                                Region.TOGGLE_BUTTON, //
                                Region.OPTION_PANE, //
                                Region.BUTTON, //
                                Region.DESKTOP_PANE, //
                                Region.TOOL_TIP, //
                                Region.TOOL_BAR, //
                                Region.INTERNAL_FRAME, //
                                Region.TOOL_BAR_DRAG_WINDOW, //
                                Region.TREE_CELL, //
                                Region.COLOR_CHOOSER, //
                                Region.VIEWPORT, //
                                Region.TEXT_FIELD);
    }

    @Parameter(0)
    public Region sut;

    @Override
    public Region createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.synth.Region]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.synth.Region]

}
