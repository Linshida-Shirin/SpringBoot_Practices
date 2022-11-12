package in.upcode.eshop;

import in.upcode.eshop.model.Item;
import in.upcode.eshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/")
    public List<Item> getAllItems(){
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public List<Item> getitem(@PathVariable int id){
        return service.getItems(id);
    }

    @PostMapping("/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addItems(@RequestBody Item item) {
        return service.addItems(item);
    }

    @PutMapping("/")
    public String updateItems(@RequestBody Item item){
        return service.updateItems(item);
    }

//    @PutMapping("/{id}")
//    public String putId(@PathVariable int id){
//        return service.putById(id);
//
//    }

    @DeleteMapping("/{id}")
    public String getObjectByid(@PathVariable int id){
        return service.getItemById(id);

    }
}
