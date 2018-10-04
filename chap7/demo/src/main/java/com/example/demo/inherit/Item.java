package com.example.demo.inherit;

import javax.persistence.*;

@Entity
// 상송 맥핑은 부모 클래스에 사용해야하는 annotation
//@Inheritance(strategy = InheritanceType.JOINED)

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// 해당 컬럼으로 자식 테이블 구분
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;
}


