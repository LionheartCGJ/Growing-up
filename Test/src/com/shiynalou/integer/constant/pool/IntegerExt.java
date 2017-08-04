package com.shiynalou.integer.constant.pool;

public class IntegerExt {
    private int i;

    private IntegerExt(int i) {
        this.i = i;
    }

    public int toIntValue() {
        return i;
    }

    private static class IntegerCache {
        static final int low = -128;
        static final int high = 127;
        static final IntegerExt cache[];

        static {
            cache = new IntegerExt[(high - low) + 1];
            int j = low;
            for (int k = 0; k < cache.length; k++)
                cache[k] = new IntegerExt(j++);
        }

        private IntegerCache() {
        }
    }

    public static IntegerExt getInstance(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new IntegerExt(i);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + i;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IntegerExt other = (IntegerExt) obj;
        if (i != other.i)
            return false;
        return true;
    }

}
