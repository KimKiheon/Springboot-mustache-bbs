package com.mustache.bbs.domain.dto;

import com.mustache.bbs.domain.entity.Article;
import lombok.Getter;

@Getter
public class ArticleDTO {
    private Long id;
    private String title;
    private String content;

    public ArticleDTO(Long id, String title, String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }
    @Override
    public String toString(){
        return "ArticleDTO{"+
                "title ='" + title + '\'' +
                ", content = '" + content + '\'' +
                '}';
    }
    public Article toEntity(){
        return new Article(title,content);
    }
}
