package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    List<Item> itemList = new ArrayList<>();

    @GetMapping("/getname")
    public String getname(){
        return "milk";
    }
    @PostMapping("/additem")
    public Item AddItem(@RequestBody Item item){
        itemList.add(item);
        return item;
    }
    @GetMapping("/getAll")
    public List<Item> getAll(){
//        private String id;
//        private String name;
//        private int qty;
//        private double unitPrice;
        itemList.add(new Item("001","milk",5,5.5));
        itemList.add((new Item("002","Butter",6,6.6)));
        return  itemList;
    }

}
