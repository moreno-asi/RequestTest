package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "agencyNews")
public class AgencyNews {
    @Id
    private String id;
    private String field2;
}
