package Bai35;

public class Box2<T> {
    private T value;

    public Box2(T value)
    {
        this.value = value;
    }

    public T getvalue()
    {
        return this.value;
    }

    public void setvalue(T value)
    {
        this.value = value;
    }
}
