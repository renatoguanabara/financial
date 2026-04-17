package com.renato.financial.repository;

import com.renato.financial.entity.Investment;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvestmentRepository extends JpaRepository<Investment, UUID> {
}
