package Journalr.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Journalr.com.model.Paper;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Integer> {
    
}