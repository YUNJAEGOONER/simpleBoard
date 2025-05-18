package com.example.board.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "boarddb")
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longtext")
    private String contents;

    //단방향 : n쪽에 manyToOne??!!
    @ManyToOne
    @JoinColumn(name = "memeber_id")
    private Member member;

}
