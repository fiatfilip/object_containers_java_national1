package ro.siit;

public class Box<T> {
    private T content;

    Box(T o){
        content = o;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
