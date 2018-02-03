package by.tc.task01.entity.category;

import java.util.HashMap;
import java.util.Map;

public class   Criteria {
    private Map<String, String> criteria = new HashMap<>();

    public void add(String searchCriteria, String value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, String> getCriteria() {
        return criteria;
    }
    public void remove(String  searchCriteria ){
        criteria.remove(searchCriteria);
    }


}
