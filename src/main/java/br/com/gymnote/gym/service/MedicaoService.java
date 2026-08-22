package br.com.gymnote.gym.service;

import br.com.gymnote.gym.entity.Medicao;
import br.com.gymnote.gym.repository.MedicaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicaoService {

    private final MedicaoRepository medicaoRepository;

    public MedicaoService (MedicaoRepository medicaoRepository){
        this.medicaoRepository = medicaoRepository;
    }

    public Medicao registrarMedicao(Medicao medicao){
        calcularResultadosCorporais(medicao);

        return medicaoRepository.save(medicao);
    }

    public List<Medicao> listarHistorico() {
        return medicaoRepository.findAllByOrderByDataRegistroDesc();
    }

    private void calcularResultadosCorporais(Medicao medicao) {
        double cintura = medicao.getCinturaUmbigoCm();
        double pescoco = medicao.getPescocoCm();
        double altura = medicao.getAlturaCm();
        double peso = medicao.getPesoKg();

        double logCinturaPesoco = Math.log10(cintura - pescoco);
        double logAltura = Math.log10(altura);

        double denominador = 1.0324 - (0.19077 * logCinturaPesoco) + (0.15456 * logAltura);
        double bfCalculado = (495.0 / denominador) - 450.0;

        bfCalculado = Math.round(bfCalculado * 100.0) / 100.0;

        double gorduraKg = peso * (bfCalculado / 100.0);
        double massaMagraCalculada = peso - gorduraKg;

        massaMagraCalculada = Math.round(massaMagraCalculada * 100.0) / 100.0;

        medicao.setBfPercentual(bfCalculado);
        medicao.setMassaMagraKg(massaMagraCalculada);
    }
}
