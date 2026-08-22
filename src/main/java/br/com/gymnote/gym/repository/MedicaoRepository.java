package br.com.gymnote.gym.repository;

import br.com.gymnote.gym.entity.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicaoRepository extends JpaRepository<Medicao, Long> {

    List<Medicao> findAllByOrderByDataRegistroDesc();

    Medicao findTopByOrderByDataRegistroDesc();
}
