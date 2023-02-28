package com.example.Book_My_Show.Repository;


import com.example.Book_My_Show.Entities.ShowSeatEntity;
import com.example.Book_My_Show.Entities.TheaterSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatRepository extends JpaRepository<TheaterSeatEntity, Integer> {
}
