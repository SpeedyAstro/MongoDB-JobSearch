package in.astro.model;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "JobPost")
public class Post {
    @Id
    private Integer id;
    private String profile;
    private String desc;
    private int exp;
    private String [] techs;
}
