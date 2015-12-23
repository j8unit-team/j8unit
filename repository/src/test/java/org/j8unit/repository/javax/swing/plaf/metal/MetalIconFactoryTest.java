package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalIconFactoryTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests<javax.swing.plaf.metal.MetalIconFactory> {

    @Override
    public javax.swing.plaf.metal.MetalIconFactory createNewSUT() {
        return new javax.swing.plaf.metal.MetalIconFactory();
    }

    @RunWith(J8Unit4.class)
    public static class TreeLeafIconTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeLeafIconTests<javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon> {

        @Override
        public javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon createNewSUT() {
            return new javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon();
        }

    }

    @RunWith(J8Unit4.class)
    public static class TreeControlIconTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeControlIconTests<javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon> {

        @Override
        public javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class TreeFolderIconTest
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeFolderIconTests<javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon> {

        @Override
        public javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon createNewSUT() {
            return new javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon();
        }

    }

    @RunWith(J8Unit4.class)
    public static class FileIcon16Test
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FileIcon16Tests<javax.swing.plaf.metal.MetalIconFactory.FileIcon16> {

        @Override
        public javax.swing.plaf.metal.MetalIconFactory.FileIcon16 createNewSUT() {
            return new javax.swing.plaf.metal.MetalIconFactory.FileIcon16();
        }

    }

    @RunWith(J8Unit4.class)
    public static class FolderIcon16Test
    implements org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.FolderIcon16Tests<javax.swing.plaf.metal.MetalIconFactory.FolderIcon16> {

        @Override
        public javax.swing.plaf.metal.MetalIconFactory.FolderIcon16 createNewSUT() {
            return new javax.swing.plaf.metal.MetalIconFactory.FolderIcon16();
        }

    }

    @RunWith(J8Unit4.class)
    public static class PaletteCloseIconTest
    implements
    org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.PaletteCloseIconTests<javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon> {

        @Override
        public javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon createNewSUT() {
            return new javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon();
        }

    }

}
