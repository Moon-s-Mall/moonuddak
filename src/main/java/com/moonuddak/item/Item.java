package com.moonuddak.item;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

//TODO Data 어노테이션을 사용해야 Validation이 정상 동작함.. 이유를 모르겠음 (Data 어노테이션
// 사용 안하고 싶지만 해결못해서 사용)

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    @NotBlank(message = "상품 이름을 입력해 주세요.")
    private String itemName;

    @Column
    @DecimalMax(value = "100000.00", message = "10만원 이하로 입력해주세요.")
    @DecimalMin(value = "0.0", message = "가격을 정확히 입력해주세요.")
    @NotNull(message = "가격을 입력해주세요.")
    private BigDecimal price;

    @Column
    private String description;
}
