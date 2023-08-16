package x.nanocomp.nanox.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@RequiredArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private final User author;

    @NotEmpty
    private String text;

    @OneToMany
    private List<Post> replies;

    @ManyToMany(mappedBy = "likedPosts")
    private Set<User> likedBy;

    private int likeCount;

    @CreatedDate
    private Date createdAt = new Date();
}
