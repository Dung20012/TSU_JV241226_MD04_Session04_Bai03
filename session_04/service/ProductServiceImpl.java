package com.data.session_04.service;

import com.data.session_04.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
            list.add(new Product(1,"Khoai tây", 150000, 50, "Ngon"));
            list.add(new Product(2,"Cà rốt", 120000, 30, "Giòn"));
            list.add(new Product(3,"Hành tây", 200000, 40, "Ngọt"));
        return list;
    }
}
