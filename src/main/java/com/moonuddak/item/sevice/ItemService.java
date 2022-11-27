package com.moonuddak.item.sevice;

import com.moonuddak.item.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    public void save(Item item);
}
