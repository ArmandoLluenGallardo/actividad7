package SafeBox;

public class SafeKey {
    private String key;

    public String getKey(){
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public int hashCode() {
        int res =17;
        res= res *31 + key == null? 0: key.hashCode();
        return res;
    }

    public boolean equals(Object arg) {
        if (arg==null || !(arg instanceof SafeKey)) {
            return false;
        }
        return key.equals(((SafeKey) arg).getKey());
    }
}
