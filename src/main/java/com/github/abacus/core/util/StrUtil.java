package com.github.abacus.core.util;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("unused")
public class StrUtil {

    public static boolean isEmpty(final Object source) {
        return source == null || source.toString().length() == 0;
    }

    public static boolean isNotEmpty(final Object source) {
        return !isEmpty(source);
    }

    /**
     * Object to {@link String}, return "" if null
     */
    public static String toStringDefaultEmpty(final Object obj) {
        return null == obj ? StringUtils.EMPTY : obj.toString();
    }

    /**
     * Object to {@link String}, return null if null
     */
    public static String toStringDefaultNull(final Object obj) {
        return null == obj ? null : obj.toString();
    }

    private StrUtil() {}
}
