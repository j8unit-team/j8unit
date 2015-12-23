package org.j8unit.repository.javax.swing.plaf.synth;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class RegionTest
implements org.j8unit.repository.javax.swing.plaf.synth.RegionTests<javax.swing.plaf.synth.Region> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.swing.plaf.synth.Region.TABBED_PANE, //
                                javax.swing.plaf.synth.Region.FORMATTED_TEXT_FIELD, //
                                javax.swing.plaf.synth.Region.DESKTOP_ICON, //
                                javax.swing.plaf.synth.Region.SLIDER_TRACK, //
                                javax.swing.plaf.synth.Region.SEPARATOR, //
                                javax.swing.plaf.synth.Region.TEXT_AREA, //
                                javax.swing.plaf.synth.Region.ARROW_BUTTON, //
                                javax.swing.plaf.synth.Region.MENU_ITEM, //
                                javax.swing.plaf.synth.Region.POPUP_MENU_SEPARATOR, //
                                javax.swing.plaf.synth.Region.MENU_ITEM_ACCELERATOR, //
                                javax.swing.plaf.synth.Region.SPINNER, //
                                javax.swing.plaf.synth.Region.SCROLL_PANE, //
                                javax.swing.plaf.synth.Region.MENU_BAR, //
                                javax.swing.plaf.synth.Region.CHECK_BOX_MENU_ITEM, //
                                javax.swing.plaf.synth.Region.TABBED_PANE_TAB_AREA, //
                                javax.swing.plaf.synth.Region.SLIDER_THUMB, //
                                javax.swing.plaf.synth.Region.CHECK_BOX, //
                                javax.swing.plaf.synth.Region.TREE, //
                                javax.swing.plaf.synth.Region.TEXT_PANE, //
                                javax.swing.plaf.synth.Region.TABLE_HEADER, //
                                javax.swing.plaf.synth.Region.LIST, //
                                javax.swing.plaf.synth.Region.TOOL_BAR_CONTENT, //
                                javax.swing.plaf.synth.Region.ROOT_PANE, //
                                javax.swing.plaf.synth.Region.COMBO_BOX, //
                                javax.swing.plaf.synth.Region.TABLE, //
                                javax.swing.plaf.synth.Region.SLIDER, //
                                javax.swing.plaf.synth.Region.RADIO_BUTTON_MENU_ITEM, //
                                javax.swing.plaf.synth.Region.INTERNAL_FRAME_TITLE_PANE, //
                                javax.swing.plaf.synth.Region.TOOL_BAR_SEPARATOR, //
                                javax.swing.plaf.synth.Region.LABEL, //
                                javax.swing.plaf.synth.Region.PROGRESS_BAR, //
                                javax.swing.plaf.synth.Region.EDITOR_PANE, //
                                javax.swing.plaf.synth.Region.PANEL, //
                                javax.swing.plaf.synth.Region.TABBED_PANE_TAB, //
                                javax.swing.plaf.synth.Region.SPLIT_PANE, //
                                javax.swing.plaf.synth.Region.SCROLL_BAR_TRACK, //
                                javax.swing.plaf.synth.Region.TABBED_PANE_CONTENT, //
                                javax.swing.plaf.synth.Region.FILE_CHOOSER, //
                                javax.swing.plaf.synth.Region.PASSWORD_FIELD, //
                                javax.swing.plaf.synth.Region.POPUP_MENU, //
                                javax.swing.plaf.synth.Region.SCROLL_BAR, //
                                javax.swing.plaf.synth.Region.SPLIT_PANE_DIVIDER, //
                                javax.swing.plaf.synth.Region.RADIO_BUTTON, //
                                javax.swing.plaf.synth.Region.MENU, //
                                javax.swing.plaf.synth.Region.SCROLL_BAR_THUMB, //
                                javax.swing.plaf.synth.Region.TOGGLE_BUTTON, //
                                javax.swing.plaf.synth.Region.OPTION_PANE, //
                                javax.swing.plaf.synth.Region.BUTTON, //
                                javax.swing.plaf.synth.Region.DESKTOP_PANE, //
                                javax.swing.plaf.synth.Region.TOOL_TIP, //
                                javax.swing.plaf.synth.Region.TOOL_BAR, //
                                javax.swing.plaf.synth.Region.INTERNAL_FRAME, //
                                javax.swing.plaf.synth.Region.TOOL_BAR_DRAG_WINDOW, //
                                javax.swing.plaf.synth.Region.TREE_CELL, //
                                javax.swing.plaf.synth.Region.COLOR_CHOOSER, //
                                javax.swing.plaf.synth.Region.VIEWPORT, //
                                javax.swing.plaf.synth.Region.TEXT_FIELD);
    }

    @Parameter(0)
    public javax.swing.plaf.synth.Region sut;

    @Override
    public javax.swing.plaf.synth.Region createNewSUT() {
        return this.sut;
    }

}
