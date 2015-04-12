package catalyst.potential.models;

import org.springframework.data.annotation.Id;

/**
 * Created by rgb24 on 4/12/15.
 */
public class Stage {

    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
