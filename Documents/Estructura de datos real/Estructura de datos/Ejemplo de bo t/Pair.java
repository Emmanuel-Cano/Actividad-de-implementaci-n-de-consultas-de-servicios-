public class Pair <K, L>{
    private K key;
    private L value;

    public Pair(K key, L value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public L getValue() {
        return value;
    }

    public void setValue(L value) {
        this.value = value;
    }

}