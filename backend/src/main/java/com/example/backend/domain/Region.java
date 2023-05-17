package com.example.backend.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Region {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Long regionId;

    private String regionKeyward;

    private String regionName;


    @OneToMany
    private List<Post> posts;


}
