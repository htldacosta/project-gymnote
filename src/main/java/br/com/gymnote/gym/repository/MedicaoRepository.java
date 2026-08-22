package br.com.gymnote.gym.repository;

import br.com.gymnote.gym.entity.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MedicaoRepository extends JpaRepository<Medicao, Long> {

    List<Medicao> findAllByOrderByDataRegistroDesc();

    Medicao findTopByOrderByDataRegistroDesc();
}
