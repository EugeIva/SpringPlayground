package SpringPlayground.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Author {

    @Id
    private UUID id;
    private String authorName;
    private String description;

}
