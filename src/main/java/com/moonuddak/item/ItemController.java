package com.moonuddak.item;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    @ModelAttribute("itemTest")
    public Item itemModelTest(){
        return Item.builder()
                .id(Long.valueOf(1000001))
                .itemName("무너딱표 후드")
                .price(BigDecimal.valueOf(10000))
                .description("아이템 설명")
                .build();
    }

    @GetMapping("")
    public String itemMain(){
        return "item/itemMain";
    }
}
