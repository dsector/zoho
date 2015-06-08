package catalyst.marketprofile.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

    @Id
    private String id;

    private String name;

    private Float federal;

    private Float state;

    private Float utility;

    private Float tax;

    private Float rebates;
}
