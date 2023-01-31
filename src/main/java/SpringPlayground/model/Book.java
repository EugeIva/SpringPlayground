package SpringPlayground.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Book {
    @Id
    private UUID id;
    private String bookName;
    private String description;
}
