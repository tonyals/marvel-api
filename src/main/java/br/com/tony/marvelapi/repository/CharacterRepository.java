package br.com.tony.marvelapi.repository;

import br.com.tony.marvelapi.domain.RepositoryTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<RepositoryTest, Long> {}
