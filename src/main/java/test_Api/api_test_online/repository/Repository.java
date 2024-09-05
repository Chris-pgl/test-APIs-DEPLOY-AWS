package test_Api.api_test_online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test_Api.api_test_online.entity.Product;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Product, Long> {
}
