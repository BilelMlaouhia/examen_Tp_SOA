package com.bilelmlaouhia.examen_tp_soa.Metier.InterfacesMetier;


import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import com.bilelmlaouhia.examen_tp_soa.Entities.Client;

import java.util.List;

public interface ArticleMetier {

    public Article saveArticle(Article a);
    public Article getArticleByNumArticle(Long numArticle);
    public List<Article> getAllArticles();
    public void deleteArtcile(Long id);
    public Client getOwner(Long id);


}
