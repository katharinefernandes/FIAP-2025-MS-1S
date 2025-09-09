package com.example.demo.service;

import com.example.demo.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private final Map<Long, Product> products = new ConcurrentHashMap<>();
  private final AtomicLong idGenerator = new AtomicLong();

  public List<Product> findAll() {
    return new ArrayList<>(products.values());
  }

  public Product findById(Long id) {
    return products.get(id);
  }

  public Product create(Product product) {
    product.setId(idGenerator.incrementAndGet());
    products.put(product.getId(), product);
    return product;
  }

  public Product update(Long id, Product product) {
    if (!products.containsKey(id)) {
      return null;
    }
    product.setId(id);
    products.put(id, product);
    return product;
  }

  public Product patch(Long id, Product updates) {
    Product existing = products.get(id);
    if (existing == null) {
      return null;
    }

    if (updates.getName() != null) {
      existing.setName(updates.getName());
    }
    if (updates.getPrice() != null) {
      existing.setPrice(updates.getPrice());
    }
    if (updates.getDescription() != null) {
      existing.setDescription(updates.getDescription());
    }

    return existing;
  }

  public boolean delete(Long id) {
    return products.remove(id) != null;
  }
}
