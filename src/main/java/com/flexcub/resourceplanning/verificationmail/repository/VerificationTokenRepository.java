package com.flexcub.resourceplanning.verificationmail.repository;//package com.flexcub.resourceplanning.verificationmail.repository;

import com.flexcub.resourceplanning.verificationmail.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer> {

    VerificationToken findByToken(String token);

    VerificationToken removeByToken(String token);
}

