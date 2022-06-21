package SafeBox;

public class MaliciousSafeKey extends SafeKey {
    private static int guessedHashCode =0;

    //override
    public int hashCode(){
        guessedHashCode++;
        return guessedHashCode;
    }

    //override
    public boolean equals(Object arg){
        return true;
    }
}
