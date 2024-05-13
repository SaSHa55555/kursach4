package com.mirea.petshop.services;

import com.mirea.petshop.models.Product;
import com.mirea.petshop.repositories.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private IProductRepository iProductRepository;

    @Autowired
    public ProductService(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    /**
    * Возвращает список всех товаров по определенному типу или список всех товаров.
    *
    * @param typeId идентификатор интересующего товара
    * @return список товаров по id или всех товаров
    */
    public List<Product> getAllProductsByTypeId(int typeId) {
        if (typeId != 0)
            return iProductRepository.findAllByTypeId(typeId);
        else
            return getAllProducts();
    }

    /**
    * Возвращает список всех товаров.
    *
    * @return список товаров
    */
    public List<Product> getAllProducts() {
        return iProductRepository.findAll();
    }

    /**
    * Возвращает товар с определенным id.
    *
    * @param id идентификатор интересующего товара
    * @return Товар
    */
    public Product getProductById(int id) {
        return iProductRepository.findById(id);
    }
}
