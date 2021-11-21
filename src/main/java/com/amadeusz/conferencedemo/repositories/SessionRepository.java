package com.amadeusz.conferencedemo.repositories;

import com.amadeusz.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
