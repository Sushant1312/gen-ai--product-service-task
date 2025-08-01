package com.example.product_service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepository;
import com.example.product_service.service.ProductService;

class ProductServiceApplicationTests {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    public ProductServiceApplicationTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllProducts() {
        Product product1 = new Product("Product1", "Desc1", 10.0);
        Product product2 = new Product("Product2", "Desc2", 20.0);
        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        List<Product> products = productService.getAllProducts();
        assertEquals(2, products.size());
    }

    @Test
    void testGetProductById() {
        Product product = new Product("Product1", "Desc1", 10.0);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Optional<Product> found = productService.getProductById(1L);
        assertTrue(found.isPresent());
        assertEquals("Product1", found.get().getName());
    }

    @Test
    void testCreateProduct() {
        Product product = new Product("Product1", "Desc1", 10.0);
        when(productRepository.save(product)).thenReturn(product);

        Product created = productService.createProduct(product);
        assertEquals("Product1", created.getName());
    }
}