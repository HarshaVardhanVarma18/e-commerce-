package com.e_commece.E_Commerce.website.using.SpringBoot.WishList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @PostMapping("/wishlist/add")
    @ResponseBody
    public WishList addToWishlist(@RequestBody WishList item) {
        return wishListService.addItem(item);
    }

    @GetMapping("/wishlist")
    @ResponseBody
    public List<WishList> viewWishlistApi() {
        return wishListService.getAllItems();
    }

    @DeleteMapping("/wishlist/remove/{id}")
    @ResponseBody
    public ResponseEntity<String> removeFromWishlist(@PathVariable Long id) {
        wishListService.removeItem(id);
        return ResponseEntity.ok("Item removed from wishlist");
    }

    @GetMapping("/wishlist/view")
    public String showWishlist(Model model) {
        List<WishList> items = wishListService.getAllItems();
        model.addAttribute("wishlist", items);
        return "wishlist";
    }
}
