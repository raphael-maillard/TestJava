package com.example.TestProject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "commentaire")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentaireid")
    private int commentId;

    @Column(name = "contenu")
    private String content;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="produitid")
    private Product product;
}