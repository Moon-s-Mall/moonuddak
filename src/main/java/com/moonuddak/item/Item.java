package com.moonuddak.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @NotBlank(message = "상품 이름을 입력해 주세요.")
    @NotNull
    private String itemName;

    @Column
    @NotBlank(message = "상품 가격을 입력해 주세요.")
    @NotNull
    private BigDecimal price;

    @Column
    private String description;
}
