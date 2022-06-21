package SafeBox;
import java.util.HashMap;
import java.util.Map;

public class SafeManager {
    private Map<SafeKey, String> treasureMap = new HashMap<SafeKey, String>();

    public SafeManager(){
        SafeKey ssn = new SafeKey();
        ssn.setKey("Numero de seguro social");
        treasureMap.put(ssn, "123-456-789");
    }

    public Object getTreasure(SafeKey safeKey){
        return treasureMap.get(safeKey);
    }

    public void setTreasure(SafeKey safeKey, String treasure){
        treasureMap.put(safeKey, treasure);
    }
}
