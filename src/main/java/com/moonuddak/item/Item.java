package com.moonuddak.item;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
    @DecimalMax(value = "100000.00", message = "10만원 이하로 입력해주세요.")
    @DecimalMin(value = "0.0", message = "가격을 정확히 입력해주세요.")
    @NotNull
    private BigDecimal price;

    @Column
    private String description;
}
