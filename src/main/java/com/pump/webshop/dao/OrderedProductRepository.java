package com.pump.webshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderedProductRepository extends JpaRepository<OrderedProductRepository, Long> {
}
