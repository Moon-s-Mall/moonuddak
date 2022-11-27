package com.moonuddak.item.sevice.impl;

import com.moonuddak.item.Item;
import com.moonuddak.item.mapper.ItemRepository;
import com.moonuddak.item.sevice.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }
}
