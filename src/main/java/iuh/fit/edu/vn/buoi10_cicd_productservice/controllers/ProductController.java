package iuh.fit.edu.vn.buoi10_cicd_productservice.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @PostMapping("/create")
    public String createProduct() {
        return "Product created";

    }
}
