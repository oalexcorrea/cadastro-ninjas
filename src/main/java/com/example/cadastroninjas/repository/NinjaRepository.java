package com.example.cadastroninjas.repository;

import com.example.cadastroninjas.entity.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {
}
