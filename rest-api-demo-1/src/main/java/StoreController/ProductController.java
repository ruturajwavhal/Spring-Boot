package StoreController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    private List<Product> productList = new ArrayList<>();
    public ProductController(){
        productList.add(new Product(1, "Colgate", 49, 4));
        productList.add(new Product(2, "Santoor", 20, 2));
        productList.add(new Product(3, "Dettol", 60, 9));

    }

    // get all products list
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productList); // 200 OK
    }

    // get product by id
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id){
        return productList.stream()
                .filter(p -> p.getId() == id )
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    //get product by id using RequestParam
    @GetMapping("/byId")
    public ResponseEntity<Product> getProductByQueryParams(@RequestParam("idValue") int id ){
        return productList.stream()
                .filter(p -> p.getId() == id )
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    //Post - add new student
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product p){
        productList.add(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }






}
