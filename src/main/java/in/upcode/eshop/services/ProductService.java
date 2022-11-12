package in.upcode.eshop.services;

import in.upcode.eshop.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private static List<Item> loadItemsFromDb(){
        List<Item> itmObject = new ArrayList<Item>();
        itmObject.add(new Item(1,"Shoe",400));
        itmObject.add(new Item(2,"Bag",650));
        itmObject.add(new Item(3,"Book",700));
        itmObject.add(new Item(4,"Bottle",300));
        itmObject.add(new Item(5,"Toys",900));
        return itmObject;
    }
    private List<Item> items = loadItemsFromDb();

    public List<Item> getAllItems() {
        return items;
    }

    public List<Item> getItems(int id){
        return loadItemsFromDb().stream().filter(item->item.getid() == id)
                .collect(Collectors.toList());
    }
    public String addItems(Item item){
        items.add(item);
        return "Item Added Successfully";
    }

    public String updateItems(Item item){
        boolean resourceFound=false;
        for(Item currentItem:items){
            if(currentItem.getid() == item.getid()){
                resourceFound =true;
                currentItem.setid(item.getid());
                currentItem.setname(item.getname());
                currentItem.setquantity(item.getquantity());
            }
        }
        if(!resourceFound){
            items.add(item);
            return "Item Added Successfully";
        }
        return "Item Updated Successfully";
    }

    public String getItemById(int id){
        items.remove(id-1);
        return "Item Deleted Successfully";
    }


}
