package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Collections.emptyList;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.analysis.TypePosition.TOP_LEVEL;
import static org.j8unit.generator.util.Arrays.baseComponentTypeOf;
import static org.j8unit.generator.util.Java.JAVA_LANG_PACKAGE;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * TODO (Issue #40): JavaDoc
 */
public final class ImportMemory {

    private List<String> claimed = emptyList();

    public void setClaimedNames(final List<String> claimed) {
        this.claimed = requireNonNull(claimed);
    }

    private final SortedSet<Class<?>> importAccu = new TreeSet<>((x, y) -> x.getCanonicalName().compareTo(y.getCanonicalName()));

    private final SortedMap<Class<?>, SortedSet<String>> staticImportAccu = new TreeMap<>((x, y) -> x.getCanonicalName().compareTo(y.getCanonicalName()));

    public final boolean add(final String name) {
        requireNonNull(name);
        try {
            // return false;
            return this.add(Class.forName(name));
        } catch (final Throwable e) {
            return false;
        }
    }

    public final boolean add(final Class<?> type) {
        requireNonNull(type);
        if (this.claimed.contains(type.getSimpleName())) {
            return false;
        } else if (type.isPrimitive()) {
            return false;
        } else if (type.isArray()) {
            return this.add(baseComponentTypeOf(type));
        } else if (JAVA_LANG_PACKAGE.equals(type.getPackage()) && TOP_LEVEL.matches(type)) {
            return true;
        } else if (this.importAccu.contains(type)) {
            return true;
        } else {
            synchronized (this.importAccu) {
                if (this.importAccu.stream().map(Class::getSimpleName).anyMatch(type.getSimpleName()::equals)) {
                    return false;
                } else {
                    this.importAccu.add(type);
                    return true;
                }
            }
        }
    }

    public final boolean addStatic(final Class<?> type, final String name) {
        requireNonNull(type);
        requireNonNull(name);
        synchronized (this.staticImportAccu) {
            if (this.staticImportAccu.values().stream().flatMap(Collection::stream).anyMatch(name::equals)) {
                return false;
            } else {
                this.staticImportAccu.compute(type, (key, oldSet) -> {
                    if (oldSet == null) {
                        final SortedSet<String> newSet = new TreeSet<>();
                        newSet.add(name);
                        return newSet;
                    } else {
                        oldSet.add(name);
                        return oldSet;
                    }
                });
                return true;
            }
        }
    }

    public final String render(final String reference) {
        final StringBuilder sb = new StringBuilder();
        for (final Entry<Class<?>, SortedSet<String>> type : this.staticImportAccu.entrySet()) {
            for (final String name : type.getValue()) {
                sb.append(format("import static %s.%s;%n", type.getKey().getCanonicalName(), name));
            }
        }
        for (final Class<?> type : this.importAccu) {
            try {
                if (!reference.equals(type.getPackage().getName()) || !TOP_LEVEL.matches(type)) {
                    sb.append(format("import %s;%n", type.getCanonicalName()));
                }
            } catch (final Exception e) {
                throw e;
            }
        }
        return sb.toString();
    }

}
