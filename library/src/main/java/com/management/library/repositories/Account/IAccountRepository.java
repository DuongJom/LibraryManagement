package com.management.library.repositories.Account;

import com.management.library.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAccountRepository extends MongoRepository<Account, Long> {
}
