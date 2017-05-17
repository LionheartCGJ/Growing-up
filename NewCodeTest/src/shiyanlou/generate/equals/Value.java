package shiyanlou.generate.equals;

public class Value {

    int i;
    String s;

    public Value(int i, String s) {
        super();
        this.i = i;
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Value other = (Value) o;
        if (i != other.i)
            return false;
        if (s == null) {
            if (other.s != null)
                return false;
        } else if (!s.equals(other.s))
            return false;
        return true;
    }

}
