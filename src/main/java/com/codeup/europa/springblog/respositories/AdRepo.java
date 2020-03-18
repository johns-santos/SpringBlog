package com.codeup.europa.springblog.respositories;


import com.codeup.europa.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdRepo extends JpaRepository<Ad, Long> {

    Ad findByTitle(String title);

    Ad findById(long id);

    // examples using JPQL / HQL
    @Query("from Ad a where a.id like ?1")
    Ad getAdById(long id);

    @Query("from Ad a where a.title like %:term%")
    List<Ad> searchByTitleLike(@Param("term") String term);

    @Query("select title from Ad where LENGTH(title) < 10")
    List<String> getAdsOfCertainTitleLength();

    // using a native query
    @Query(nativeQuery = true, value = "SELECT title FROM ads WHERE LENGTH(title) < 10")
    List<String> getAdsOfCertainTitleLengthNative();
}