package com.moonuddak.item;

import com.moonuddak.item.sevice.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    @ModelAttribute("itemTest")
    public Item itemModelTest(){
        return Item.builder()
                .id(Long.valueOf(1000001))
                .itemName("무너딱표 후드")
                .price(BigDecimal.valueOf(10000))
                .description("아이템 설명")
                .build();
    }

    @GetMapping("/add")
    public String item(){
        return "item/addItem";
    }

    @PostMapping("/add")
    public String addItem(@Validated @ModelAttribute("itemTest") Item item, BindingResult bindingResult){
        log.debug("item log={}", item.toString());

        //검증에 실패
        if(bindingResult.hasErrors()){
            log.debug("errors = {}", bindingResult);
            return "item/addItem";
        }

        itemService.save(item);

        return "item/addItem";
    }
}
