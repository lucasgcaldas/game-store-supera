package br.com.supera.gamestore.services;

import br.com.supera.gamestore.entities.User;
import br.com.supera.gamestore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public  Optional<User> findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj;
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}

