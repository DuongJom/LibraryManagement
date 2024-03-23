package com.management.library.repositories.Account;

import com.management.library.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends MongoRepository<Account, Long> {
    Account findAccountByEmail(String email);
}
