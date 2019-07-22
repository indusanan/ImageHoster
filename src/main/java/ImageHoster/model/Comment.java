package ImageHoster.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Comment {

    @Id
    private int Id;
    private String text;
    private Date createdDate;
    @ManyToOne()
    private User user;
    @ManyToOne()
    private Image image;

}
