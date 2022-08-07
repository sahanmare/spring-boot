package lk.sampath.nw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lk.sampath.nw.model.Branch;
import lk.sampath.nw.repository.BranchRepository;

@Service
@Transactional
public class BranchService {

	@Autowired
	private BranchRepository repo;
	
	public List<Branch> listAll(){
		return repo.findAll();
	}
	
	public void save(Branch branch) {
		repo.save(branch);
	}
	
	public Branch get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
