package com.example.fptsprinboot.Repository;

import com.example.fptsprinboot.Model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository<Banner,Integer> {
}
