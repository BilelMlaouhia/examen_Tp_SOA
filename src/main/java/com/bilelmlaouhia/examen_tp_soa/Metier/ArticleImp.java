package com.bilelmlaouhia.examen_tp_soa.Metier;

import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Metier.InterfacesMetier.ArticleMetier;
import com.bilelmlaouhia.examen_tp_soa.Repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleImp implements ArticleMetier {
    @Autowired
    ArticleRepository articleRepository;
    @Override
    public Article saveArticle(Article a) {
        return articleRepository.save(a);
    }

    @Override
    public Article getArticleByNumArticle(Long numArticle) {
        return articleRepository.findById(numArticle).get();
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArtcile(Long id) {
         articleRepository.deleteById(id);
    }

    @Override
    public Client getOwner(Long id) {
       Article a = articleRepository.findById(id).get();
       return a.getOwner();
    }

}
