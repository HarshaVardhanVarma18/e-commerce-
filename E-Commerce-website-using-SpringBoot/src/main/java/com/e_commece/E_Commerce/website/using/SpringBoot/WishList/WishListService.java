package com.e_commece.E_Commerce.website.using.SpringBoot.WishList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    public WishList addItem(WishList item) {
        return wishListRepository.save(item);
    }

    public List<WishList> getAllItems() {
        return wishListRepository.findAll();
    }

    public void removeItem(Long id) {
        wishListRepository.deleteById(id);
    }
}
