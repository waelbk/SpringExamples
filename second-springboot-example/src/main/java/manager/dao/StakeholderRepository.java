package manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import manager.model.Stakeholders;

public interface StakeholderRepository extends JpaRepository<Stakeholders, Integer> {

}
