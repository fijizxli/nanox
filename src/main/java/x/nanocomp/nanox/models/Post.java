package x.nanocomp.nanox.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

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
    @NotEmpty
    private final User author;

    @NotEmpty
    private String text;

    @OneToMany
    private List<Post> replies;

    @OneToMany
    private Set<User> likedBy;

    private int likeCount;
}