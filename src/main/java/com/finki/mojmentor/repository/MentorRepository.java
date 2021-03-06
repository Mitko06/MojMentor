package com.finki.mojmentor.repository;

import com.finki.mojmentor.Model.Category;
import com.finki.mojmentor.Model.Mentor;
import com.finki.mojmentor.bootstrap.DataHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {
    Optional<Mentor> findMentorByUsername(String username);
}
