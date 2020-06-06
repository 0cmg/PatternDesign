package com.cmg.design.pattern.behavioral.memento;

/**
 * @ClassName ArticleMemento
 * @Author cmg
 * @Date 2020/6/6 17:07
 * @Description TODO
 **/
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }
}
