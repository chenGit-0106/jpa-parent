package com.chenteng.jpa.respository;

import com.chenteng.jpa.entity.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouriteRepository extends JpaRepository<Favourite,Integer> {
}
