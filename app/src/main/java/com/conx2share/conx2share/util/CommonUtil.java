package com.conx2share.conx2share.util;

import java.lang.reflect.Array;

public final class CommonUtil {
    private CommonUtil() {
    }

    public static <T> T[] combine(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }
}