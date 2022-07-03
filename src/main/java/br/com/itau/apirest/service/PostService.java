package br.com.itau.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.apirest.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
}
