package com.example.backend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Comment {
    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long commentId;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;


    private String commentText;

    private LocalDateTime commentDate;

    @Builder
    public Comment(Post post, User user, String commentText, LocalDateTime commentDate) {
        this.post = post;
        this.user = user;
        this.commentText = commentText;
        this.commentDate = commentDate;
    }



}
