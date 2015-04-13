package catalyst.potential.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rgb24 on 4/12/15.
 */
@Document
public class Stage {

    @Id
    private String _id;

    private String name;

    public String getId() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
