package lk.sampath.nw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.sampath.nw.model.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
	
}
