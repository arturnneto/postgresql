package com.artur.postgresql.service;

import com.artur.postgresql.domain.entities.AuthorEntity;

public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);
}
