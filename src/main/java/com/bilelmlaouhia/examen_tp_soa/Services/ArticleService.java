package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces.ArticleBusiness;
import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ArticleService {
    @Autowired
   private ArticleBusiness articleImp;

    @PostMapping("/articles")
    public Article saveArticle(@RequestBody Article a) {
        return articleImp.saveArticle(a);
    }

    @GetMapping("/articles/id")
    public Article getArticleByNumArticle(@PathParam("id") Long numArticle) {
        return articleImp.getArticleByNumArticle(numArticle);
    }

    @GetMapping("/articles")
    public List<Article> getAllArticles() {

        return articleImp.getAllArticles();
    }

    @DeleteMapping("/articles/id")
    public void deleteArtcile(@PathParam("id") Long numArticle) {

        articleImp.deleteArtcile(numArticle);
    }

    @GetMapping("/articles/id/owner")
    public Client getArticlesOwner(@PathParam("id") Long id){

        return articleImp.getOwner(id);
    }
}
