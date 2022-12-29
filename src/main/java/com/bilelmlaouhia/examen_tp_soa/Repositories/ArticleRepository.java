package com.bilelmlaouhia.examen_tp_soa.Repositories;

import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
