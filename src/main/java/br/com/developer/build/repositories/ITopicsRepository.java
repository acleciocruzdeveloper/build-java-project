package br.com.developer.build.repositories;

import br.com.developer.build.domain.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopicsRepository extends JpaRepository<DataEntity, Long> {
}
