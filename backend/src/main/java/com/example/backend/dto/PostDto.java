package com.example.backend.dto;


import com.example.backend.domain.Post;
import com.example.backend.domain.Region;
import com.example.backend.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PostDto {
    private Long userId;

    private Long regionId;

    private String postContent;

    private String postImage;

    private String postLatitude;

    private String postLongitude;

    private LocalDate postDate;

    private Integer postLikes;


    public Post toEntity(User user) {
        Post post = Post.builder()
                .user(user)
                .postContent(postContent)
                .postLatitude(postLatitude)
                .postLongitude(postLongitude)
                .postDate(postDate)
                .postLikes(postLikes)
                .build();
        return post;
    }
}
