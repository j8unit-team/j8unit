package org.j8unit.generator.api.control;

import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Java.PACKAGE_INFO_FILENAME;
import java.nio.file.Path;

/**
 * <p>
 * This interface specifies the handling of the {@linkplain org.j8unit.generator.api.J8UnitGenerator j8unit generator}
 * output. In detail, it provides some methods to query target folders and files plus methods to determine whether or
 * not to overwrite existing output files.
 * </p>
 */
public abstract interface GeneratorOutputControler {

    /**
     * <p>
     * Returns the target folder path to put those generated source files into that relate to the given origin
     * {@linkplain Package package}.
     * </p>
     *
     * @param pakkage
     *            the queried origin package
     * @return the target folder path to put those generated sources into that relate to the given origin package
     */
    public abstract Path targetFolderFor(final Package pakkage);

    /**
     * TODO
     */
    public abstract Path targetFileFor(final Package pakkage);

    /**
     * <p>
     * Returns the target file path to store the generated {@value org.j8unit.generator.util.Java#PACKAGE_INFO_FILENAME}
     * file into that relates to the given origin {@linkplain Package package}.
     * </p>
     *
     * @implSpec The default implementation {@linkplain Path#resolve(String) resolves}
     *           {@link org.j8unit.generator.util.Java#PACKAGE_INFO_FILENAME} against the folder returned by
     *           {@link #targetFolderFor(Package)}.
     *
     * @param pakkage
     *            the queried origin package
     * @return the target file path to store the generated data into that relates to the given origin package
     */
    public default Path targetDocFileFor(final Package pakkage) {
        requireNonNull(pakkage);
        final Path folder = this.targetFolderFor(pakkage);
        final Path path = folder.resolve(PACKAGE_INFO_FILENAME);
        return path;
    }

    /**
     * <p>
     * Returns {@code true} if the target file(s) of some generated test-code (according to the given origin
     * {@linkplain Package package}) can be overwritten in case it already exists; returns {@code false} otherwise.
     * </p>
     *
     * @param pakkage
     *            the queried origin package
     * @return {@code true} iff the target file(s) of some generated test-code can be overwritten
     */
    public abstract boolean doOverwrite(final Package pakkage);

    /**
     * <p>
     * Returns the target folder path to put those generated source files into that relate to the given origin
     * {@link Class type}.
     * </p>
     *
     * @implSpec The default implementation refers to {@link #targetDocFileFor(Package)} using
     *           {@linkplain Class#getPackage() the package} of the given {@code type}.
     *
     * @param type
     *            the queried origin type
     * @return the target folder path to put those generated sources into that relate to the given origin type
     */
    public default Path targetFolderFor(final Class<?> type) {
        requireNonNull(type);
        return this.targetFolderFor(type.getPackage());
    }

    /**
     * <p>
     * Returns the target file path to store the generated source data into that relates to the given origin
     * {@link Class type}.
     * </p>
     *
     * @param type
     *            the queried origin type
     * @return the target file path to store the generated data into that relates to the given origin type
     */
    public abstract Path targetFileFor(final Class<?> type);

    /**
     * <p>
     * Returns {@code true} if the target file(s) of some generated test-code (according to the given origin
     * {@link Class type} ) can be overwritten in case it already exists; returns {@code false} otherwise.
     * </p>
     *
     * @param type
     *            the queried origin type
     * @return {@code true} iff the target file(s) of some generated test-code can be overwritten
     */
    public abstract boolean doOverwrite(final Class<?> type);

}
